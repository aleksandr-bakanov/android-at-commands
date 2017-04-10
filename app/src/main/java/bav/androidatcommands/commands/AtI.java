package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtI extends ATcommand {
    public AtI(Context ctx) {
        super("I", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CLEAN;
        mDescription = ctx.getString(R.string.at_i_description);
    }
}
