package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtS30 extends ATcommand {
    public AtS30(Context ctx) {
        super("S30", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_s30_description);
    }
}
