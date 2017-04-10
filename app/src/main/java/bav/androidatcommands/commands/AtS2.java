package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtS2 extends ATcommand {
    public AtS2(Context ctx) {
        super("S2", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_s2_description);
    }
}
