package bav.androidatcommands;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

import bav.androidatcommands.commands.ATcommand;
import bav.androidatcommands.commands.IATcommand;

import static java.lang.System.currentTimeMillis;

public class ScanActivity extends SerialPortActivity {

    private static final String TAG = "ScanActivity";
    private static final int POLL_TIMEOUT_STEP_MS = 10;

    private Hashtable<String, IATcommand> mCommands;
    private Thread mScanTask;

    private class ScanTask implements Runnable {
        public void run() {
            IATcommand atClac = ATcommand.getCommand("+CLAC");
            runCommand(atClac);
            String[] commands = atClac.getRawAnswerClean().split("\\r?\\n");
            //Set<String> cSet = new HashSet<>(Arrays.asList(commands));

            IATcommand atQClac = ATcommand.getCommand("$QCCLAC");
            runCommand(atQClac);
            String[] qcommands = atQClac.getRawAnswerClean().split("\\r?\\n");
            //Set<String> qSet = new HashSet<>(Arrays.asList(qcommands));

            HashSet<String> fullSet = new HashSet<>();
            Collections.addAll(fullSet, commands);
            Collections.addAll(fullSet, qcommands);
            fullSet.remove("\n");
            fullSet.remove("AT+CLAC");
            fullSet.remove("OK");
            fullSet.remove("AT$QCCLAC");

            Log.d(TAG, fullSet.toString());

            //mCommands.put(atClac.getCommand(), atClac);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);

        mCommands = new Hashtable<>();

        final Button scanButton = (Button)findViewById(R.id.start_scan);
        scanButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            mScanTask = new Thread(new ScanTask());
            mScanTask.start();
            }
        });
    }

    private String readRawAnswer(int timeout) {
        StringBuilder builder = new StringBuilder();
        while (timeout > 0) {
            boolean isReadAvailable = mSerialPort.poll();
            if (isReadAvailable) {
                int size;
                try {
                    byte[] buffer = new byte[READ_BUFFER_SIZE];
                    size = mInputStream.read(buffer);
                    if (size > 0) {
                        builder.append(new String(buffer, 0, size));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else {
                timeout -= POLL_TIMEOUT_STEP_MS;
                try {
                    Thread.sleep(POLL_TIMEOUT_STEP_MS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        return builder.toString();
    }

    private void writeCommand(String command) {
        try {
            mOutputStream.write(command.getBytes());
            mOutputStream.write('\r');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void runCommand(IATcommand aTcommand) {
        long start = currentTimeMillis();
        int timeout = aTcommand.getTimeout();
        // Execute clean command
        String cleanCommand = aTcommand.getCommand();
        writeCommand(cleanCommand);
        String answerClean = readRawAnswer(timeout);
        aTcommand.setRawAnswerClean(answerClean);

        // Execute available command
        String availableCommand = aTcommand.getCommand() + "=?";
        writeCommand(availableCommand);
        String answerAvailable = readRawAnswer(timeout);
        aTcommand.setRawAnswerAvailable(answerAvailable);

        // Execute current command
        String currentCommand = aTcommand.getCommand() + "?";
        writeCommand(currentCommand);
        String answerCurrent = readRawAnswer(timeout);
        aTcommand.setRawAnswerCurrent(answerCurrent);

        long end = currentTimeMillis() - start;
        Log.d(TAG, "execution took: " + String.valueOf(end) + " ms");
    }
}
