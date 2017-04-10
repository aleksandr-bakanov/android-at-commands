package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtH extends ATcommand {
    public AtH(Context ctx) {
        super("H", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_h_description);
    }
}
