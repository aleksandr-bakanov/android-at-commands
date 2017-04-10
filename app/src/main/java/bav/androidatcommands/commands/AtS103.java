package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtS103 extends ATcommand {
    public AtS103(Context ctx) {
        super("S103", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_s103_description);
    }
}
