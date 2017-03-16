package bav.androidatcommands;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by bav on 14.03.2017.
 */

public class SettingsActivity extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.serial_port_preferences);
    }
}
