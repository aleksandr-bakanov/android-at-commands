package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtS4 extends ATcommand {
    public AtS4(Context ctx) {
        super("S4", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_s4_description);
    }
}
