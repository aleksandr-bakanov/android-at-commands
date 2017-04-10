package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtQ extends ATcommand {
    public AtQ(Context ctx) {
        super("Q", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_q_description);
    }
}
