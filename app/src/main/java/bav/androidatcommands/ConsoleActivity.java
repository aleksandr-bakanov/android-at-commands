/*
 * Copyright 2009 Cedric Priscal
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 */

package bav.androidatcommands;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.widget.EditText;
import android.text.TextWatcher;

import java.io.IOException;

public class ConsoleActivity extends SerialPortActivity {

    private ReadThread mReadThread;

    private class ReadThread extends Thread {

        @Override
        public void run() {
            super.run();
            while(!isInterrupted()) {
                int size;
                try {
                    if (mInputStream == null) return;
                    byte[] buffer = new byte[READ_BUFFER_SIZE];
                    size = mInputStream.read(buffer);
                    if (size > 0) {
                        onDataReceived(buffer, size);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
    }

    EditText mReception;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_console);

        mReception = (EditText) findViewById(R.id.EditTextReception);

        EditText Emission = (EditText) findViewById(R.id.EditTextEmission);
        Emission.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() > 1 && s.charAt(s.length() - 1) == '\n') {
                    Log.d("ConsoleActivity", "Enter was pressed");
                    int size = s.length() - 1;
                    char[] text = new char[size];
                    for (int i = 0; i < size; i++) {
                        text[i] = s.charAt(i);
                    }
                    try {
                        mOutputStream.write(new String(text).getBytes());
                        mOutputStream.write('\r');
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        /* Create a receiving thread */
        mReadThread = new ReadThread();
        mReadThread.start();
    }

    protected void onDataReceived(final byte[] buffer, final int size) {
        runOnUiThread(new Runnable() {
            public void run() {
                if (mReception != null) {
                    String s = new String(buffer, 0, size);
                    Log.d("ConsoleActivity", "onDataReceived (" + Integer.toString(size) + "): " + s);
                    mReception.append(s);
                }
            }
        });
    }

    @Override
    protected void onDestroy() {
        if (mReadThread != null)
            mReadThread.interrupt();
        super.onDestroy();
    }
}
