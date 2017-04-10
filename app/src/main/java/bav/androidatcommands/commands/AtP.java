package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtP extends ATcommand {
    public AtP(Context ctx) {
        super("P", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_p_description);
    }
}
