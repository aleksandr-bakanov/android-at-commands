package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtM extends ATcommand {
    public AtM(Context ctx) {
        super("M", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_m_description);
    }
}
