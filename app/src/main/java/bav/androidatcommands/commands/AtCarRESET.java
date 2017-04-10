package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtCarRESET extends ATcommand {
    public AtCarRESET(Context ctx) {
        super("^RESET", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_car_reset_description);
    }
}
