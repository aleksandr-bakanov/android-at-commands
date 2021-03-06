package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtS7 extends ATcommand {
    public AtS7(Context ctx) {
        super("S7", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_s7_description);
    }
}
