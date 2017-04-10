package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtE extends ATcommand {
    public AtE(Context ctx) {
        super("E", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_e_description);
    }
}
