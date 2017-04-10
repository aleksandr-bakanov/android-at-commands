package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtS6 extends ATcommand {
    public AtS6(Context ctx) {
        super("S6", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_s6_description);
    }
}
