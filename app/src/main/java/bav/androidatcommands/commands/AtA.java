package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtA extends ATcommand {
    public AtA(Context ctx) {
        super("A", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CLEAN | AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_a_description);
    }
}
