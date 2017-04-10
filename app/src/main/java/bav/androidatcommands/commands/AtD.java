package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtD extends ATcommand {
    public AtD(Context ctx) {
        super("D", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_d_description);
    }
}
