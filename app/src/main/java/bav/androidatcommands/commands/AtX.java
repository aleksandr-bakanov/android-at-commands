package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtX extends ATcommand {
    public AtX(Context ctx) {
        super("X", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_x_description);
    }
}
