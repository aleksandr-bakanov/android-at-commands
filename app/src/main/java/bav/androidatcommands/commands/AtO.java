package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtO extends ATcommand {
    public AtO(Context ctx) {
        super("O", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_o_description);
    }
}
