package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtL extends ATcommand {
    public AtL(Context ctx) {
        super("L", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_l_description);
    }
}
