package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtS8 extends ATcommand {
    public AtS8(Context ctx) {
        super("S8", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_s8_description);
    }
}
