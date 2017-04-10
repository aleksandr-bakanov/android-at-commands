package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtS0 extends ATcommand {
    public AtS0(Context ctx) {
        super("S0", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_s0_description);
    }
}
