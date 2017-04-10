package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtCarSYSINFO extends ATcommand {
    public AtCarSYSINFO(Context ctx) {
        super("^SYSINFO", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CLEAN;
        mDescription = ctx.getString(R.string.at_car_sysinfo_description);
    }
}
