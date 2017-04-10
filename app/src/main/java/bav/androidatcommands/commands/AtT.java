package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtT extends ATcommand {
    public AtT(Context ctx) {
        super("T", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_t_description);
    }
}
