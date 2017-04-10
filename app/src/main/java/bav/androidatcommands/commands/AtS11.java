package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtS11 extends ATcommand {
    public AtS11(Context ctx) {
        super("S11", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_s11_description);
    }
}
