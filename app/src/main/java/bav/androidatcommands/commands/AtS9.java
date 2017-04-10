package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtS9 extends ATcommand {
    public AtS9(Context ctx) {
        super("S9", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_s9_description);
    }
}
