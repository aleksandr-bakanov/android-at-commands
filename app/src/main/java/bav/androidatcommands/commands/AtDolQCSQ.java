package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCSQ extends ATcommand {
    public AtDolQCSQ(Context ctx) {
        super("$QCSQ", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CLEAN | AVAILABLE;
        mDescription = ctx.getString(R.string.at_dol_qcsq_description);
    }
}
