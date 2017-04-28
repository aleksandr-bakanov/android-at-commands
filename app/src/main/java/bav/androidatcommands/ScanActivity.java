package bav.androidatcommands;

import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import bav.androidatcommands.commands.ATcommand;
import bav.androidatcommands.commands.IATcommand;

import static java.lang.System.currentTimeMillis;

public class ScanActivity extends SerialPortActivity {

    private static final String TAG = "ScanActivity";
    private static final int POLL_TIMEOUT_STEP_MS = 5;
    private static final String COMMAND_EXECUTED_BG_COLOR = "#CCFBCC";
    private static final String COMMAND_NOT_EXECUTED_BG_COLOR = "#FBCCCC";

    private Hashtable<String, IATcommand> mCommands;
    private ArrayList<String> mUnknownCommands;
    private Thread mScanTask;

    private ProgressBar mProgress;
    private EditText mDebugOutput;
    private Handler mHandler = new Handler();
    private int mProgressStatus = 0;

    private class ScanTask implements Runnable {
        public void run() {
            mHandler.post(new Runnable() {
                public void run() {
                    mDebugOutput.append("Start scanning\r\n");
                }
            });

            final HashSet<String> fullSet = new HashSet<>();

            IATcommand atClac = ATcommand.getCommand("+CLAC", getApplicationContext());
            runCommand(atClac);
            String[] commandsByClac = atClac.getRawAnswerClean().split("\\r?\\n");
            for (int i = 0; i < commandsByClac.length; i++) {
                commandsByClac[i] = commandsByClac[i].trim();
            }
            Collections.addAll(fullSet, commandsByClac);

            if (Arrays.asList(commandsByClac).contains("$QCCLAC")) {
                IATcommand atQClac = ATcommand.getCommand("$QCCLAC", getApplicationContext());
                runCommand(atQClac);
                String[] commandsByQcClac = atQClac.getRawAnswerClean().split("\\r?\\n");
                for (int i = 0; i < commandsByQcClac.length; i++) {
                    commandsByQcClac[i] = commandsByQcClac[i].trim();
                }
                Collections.addAll(fullSet, commandsByQcClac);
            }

            String[] redundantCommands = {"", "AT+CLAC", "OK", "AT$QCCLAC", "ERROR"};
            for (String s : redundantCommands) {
                fullSet.remove(s);
            }

            mHandler.post(new Runnable() {
                public void run() {
                    mDebugOutput.append(String.valueOf(fullSet.size()) + " commands found\r\n");
                }
            });

            for (String c : fullSet) {
                IATcommand command = ATcommand.getCommand(c, getApplicationContext());
                if (command != null) {
                    mCommands.put(c, command);
                }
                else {
                    Log.d(TAG, "Description for command \"" + c + "\" wasn't found.");
                    mUnknownCommands.add(c);
                }
            }

            Set<String> keys = mCommands.keySet();
            int totalCommands = mCommands.size();
            int processedCommands = 0;
            int oldPercent = 0;

            List<String> keysList = new ArrayList(keys);
            Collections.sort(keysList);

            mHandler.post(new Runnable() {
                public void run() {
                    mDebugOutput.append("Executing commands...\r\n");
                }
            });

            for (String k : keysList) {
                IATcommand cmd = mCommands.get(k);
                Log.d(TAG, "cmd = " + cmd.getCommand());
                runCommand(cmd);
                processedCommands++;
                mProgressStatus = (int)(((double)processedCommands / (double)totalCommands) * 100.0);
                if (mProgressStatus > oldPercent) {
                    oldPercent = mProgressStatus;
                    mHandler.post(new Runnable() {
                        public void run() {
                            mProgress.setProgress(mProgressStatus);
                        }
                    });
                }
            }

            mHandler.post(new Runnable() {
                public void run() {
                    mDebugOutput.append("Saving results...\r\n");
                }
            });

            try {
                File file = new File(Environment.getExternalStorageDirectory(), "androidatcommands.html");
                file.createNewFile();
                FileOutputStream fOut = new FileOutputStream(file);
                OutputStreamWriter myOutWriter = new OutputStreamWriter(fOut);
                myOutWriter.append(getScanResultsAsHtml());
                myOutWriter.close();
                fOut.close();
            } catch (Exception ex) {
                Log.d(TAG, "ex: " + ex);
            }

            mHandler.post(new Runnable() {
                public void run() {
                    mDebugOutput.append("Results have been saved to sdcard/androidatcommands.html\r\n");
                }
            });
        }
    }

    private String getScanResultsAsHtml()
    {
        StringBuilder htmlBuilder = new StringBuilder();
        /// TODO: localize html
        htmlBuilder.append("<html><head><meta charset=\"UTF-8\"><style>table{width:100%;}table,th,td{border:1px solid black;}</style></head><body>");
        htmlBuilder.append("<h2>Hello :)</h2>");
        htmlBuilder.append("<b>Please support development of this application by sending these results to developer: ");
        htmlBuilder.append("<a href=\"mailto:bakanov.aleksandr@gmail.com?Subject=AndroidAtCommandsResults\">bakanov.aleksandr@gmail.com</a></b><br/>");
        htmlBuilder.append("At the bottom of this page you can find list of commands which are unknown to application. Together we can make them known :)");

        // References list
        htmlBuilder.append("<h2>References</h2>");
        htmlBuilder.append("<ol>");
        htmlBuilder.append("<li>"); htmlBuilder.append(getString(R.string.desc_ref_001)); htmlBuilder.append("</li>");
        htmlBuilder.append("<li>"); htmlBuilder.append(getString(R.string.desc_ref_002)); htmlBuilder.append("</li>");
        htmlBuilder.append("<li>"); htmlBuilder.append(getString(R.string.desc_ref_003)); htmlBuilder.append("</li>");
        htmlBuilder.append("<li>"); htmlBuilder.append(getString(R.string.desc_ref_004)); htmlBuilder.append("</li>");
        htmlBuilder.append("<li>"); htmlBuilder.append(getString(R.string.desc_ref_005)); htmlBuilder.append("</li>");
        htmlBuilder.append("<li>"); htmlBuilder.append(getString(R.string.desc_ref_006)); htmlBuilder.append("</li>");
        htmlBuilder.append("<li>"); htmlBuilder.append(getString(R.string.desc_ref_007)); htmlBuilder.append("</li>");
        htmlBuilder.append("<li>"); htmlBuilder.append(getString(R.string.desc_ref_008)); htmlBuilder.append("</li>");
        htmlBuilder.append("<li>"); htmlBuilder.append(getString(R.string.desc_ref_009)); htmlBuilder.append("</li>");
        htmlBuilder.append("<li>"); htmlBuilder.append(getString(R.string.desc_ref_010)); htmlBuilder.append("</li>");
        htmlBuilder.append("<li>"); htmlBuilder.append(getString(R.string.desc_ref_011)); htmlBuilder.append("</li>");
        htmlBuilder.append("<li>"); htmlBuilder.append(getString(R.string.desc_ref_012)); htmlBuilder.append("</li>");
        htmlBuilder.append("<li>"); htmlBuilder.append(getString(R.string.desc_ref_013)); htmlBuilder.append("</li>");
        htmlBuilder.append("<li>"); htmlBuilder.append(getString(R.string.desc_ref_014)); htmlBuilder.append("</li>");
        htmlBuilder.append("<li>"); htmlBuilder.append(getString(R.string.desc_ref_015)); htmlBuilder.append("</li>");
        htmlBuilder.append("<li>"); htmlBuilder.append(getString(R.string.desc_ref_016)); htmlBuilder.append("</li>");
        htmlBuilder.append("</ol>");

        // Table creation
        htmlBuilder.append("<h2>Scan results</h2>");
        htmlBuilder.append("<b>Legend</b>:<br/><span style=\"background-color:");
        htmlBuilder.append(COMMAND_EXECUTED_BG_COLOR);
        htmlBuilder.append("\">Green cell</span> means that command has been executed, <span style=\"background-color:");
        htmlBuilder.append(COMMAND_NOT_EXECUTED_BG_COLOR);
        htmlBuilder.append("\">red cell</span> means that it was not. For safety reasons.<br/>TODO means that description of such commands will be added later.<br/><br/>");
        htmlBuilder.append("<table><tr><th>Command</th><th>Description</th><th>Clean answer</th><th>Available answer</th><th>Current answer</th></tr>");

        Set<String> keys = mCommands.keySet();
        List<String> keysList = new ArrayList(keys);
        Collections.sort(keysList);

        for (String k : keysList) {
            IATcommand cmd = mCommands.get(k);
            htmlBuilder.append("<tr>");
            htmlBuilder.append("<td valign=\"top\"><code>");
            htmlBuilder.append(cmd.getCommand());
            htmlBuilder.append("</code></td>");
            htmlBuilder.append("<td valign=\"top\"><code>");
            htmlBuilder.append(cmd.getDescription());
            htmlBuilder.append("</code></td>");
            htmlBuilder.append("<td valign=\"top\" bgcolor=\""); htmlBuilder.append(getCellBgColor(cmd, ATcommand.CLEAN)); htmlBuilder.append("\"><code>");
            htmlBuilder.append(cmd.getRawAnswerClean().replaceAll("\n", "<br/>"));
            htmlBuilder.append("</code></td>");
            htmlBuilder.append("<td valign=\"top\" bgcolor=\""); htmlBuilder.append(getCellBgColor(cmd, ATcommand.AVAILABLE)); htmlBuilder.append("\"><code>");
            htmlBuilder.append(cmd.getRawAnswerAvailable().replaceAll("\n", "<br/>"));
            htmlBuilder.append("</code></td>");
            htmlBuilder.append("<td valign=\"top\" bgcolor=\""); htmlBuilder.append(getCellBgColor(cmd, ATcommand.CURRENT)); htmlBuilder.append("\"><code>");
            htmlBuilder.append(cmd.getRawAnswerCurrent().replaceAll("\n", "<br/>"));
            htmlBuilder.append("</code></td>");
            htmlBuilder.append("</tr>");
        }
        htmlBuilder.append("</table>");

        // Unknown commands
        htmlBuilder.append("<h3>Unknown commands</h3>Next commands are unknown for application. It would be great if you help to provide description of them.<br/><code>");
        Collections.sort(mUnknownCommands);
        for (String c : mUnknownCommands) {
            htmlBuilder.append(c);
            htmlBuilder.append(" ");
        }
        htmlBuilder.append("</code>");

        htmlBuilder.append("</body></html>");
        return htmlBuilder.toString();
    }

    private String getCellBgColor(IATcommand cmd, int mode) {
        return (cmd.getAllowedCommandFormats() & mode) > 0 ? COMMAND_EXECUTED_BG_COLOR : COMMAND_NOT_EXECUTED_BG_COLOR;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);

        mProgress = (ProgressBar) findViewById(R.id.scan_progressbar);
        mDebugOutput = (EditText) findViewById(R.id.debug_output);

        mCommands = new Hashtable<>();
        mUnknownCommands = new ArrayList<>();

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
        String at = "AT";
        try {
            mOutputStream.write(at.getBytes());
            mOutputStream.write(command.getBytes());
            mOutputStream.write('\r');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void runCommand(IATcommand aTcommand) {
        int timeout = aTcommand.getTimeout();
        // Execute clean command if it's allowed
        if (aTcommand.isRunAllowed(ATcommand.CLEAN)) {
            String cleanCommand = aTcommand.getCommand();
            writeCommand(cleanCommand);
            String answerClean = readRawAnswer(timeout);
            aTcommand.setRawAnswerClean(answerClean);
        }
        // Execute available command if it's allowed
        if (aTcommand.isRunAllowed(ATcommand.AVAILABLE)) {
            String availableCommand = aTcommand.getCommand() + "=?";
            writeCommand(availableCommand);
            String answerAvailable = readRawAnswer(timeout);
            aTcommand.setRawAnswerAvailable(answerAvailable);
        }
        // Execute current command if it's allowed
        if (aTcommand.isRunAllowed(ATcommand.CURRENT)) {
            String currentCommand = aTcommand.getCommand() + "?";
            writeCommand(currentCommand);
            String answerCurrent = readRawAnswer(timeout);
            aTcommand.setRawAnswerCurrent(answerCurrent);
        }
    }
}
