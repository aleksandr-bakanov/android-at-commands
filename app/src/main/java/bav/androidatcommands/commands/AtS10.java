package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtS10 extends ATcommand {
    public AtS10(Context ctx) {
        super("S10", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_s10_description);
    }
}
