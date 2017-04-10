package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCSYSMODE extends ATcommand {
    public AtDolQCSYSMODE(Context ctx) {
        super("$QCSYSMODE", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CLEAN;
        mDescription = ctx.getString(R.string.at_dol_qcsysmode_description);
    }
}
