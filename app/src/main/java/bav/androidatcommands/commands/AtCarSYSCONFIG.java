package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtCarSYSCONFIG extends ATcommand {
    public AtCarSYSCONFIG(Context ctx) {
        super("^SYSCONFIG", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CURRENT;
        mDescription = ctx.getString(R.string.at_car_sysconfig_description);
    }
}
