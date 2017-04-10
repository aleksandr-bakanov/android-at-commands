package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtCarCPIN extends ATcommand {
    public AtCarCPIN(Context ctx) {
        super("^CPIN", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CURRENT;
        mDescription = ctx.getString(R.string.at_car_cpin_description);
    }
}
