package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtV extends ATcommand {
    public AtV(Context ctx) {
        super("V", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_v_description);
    }
}
