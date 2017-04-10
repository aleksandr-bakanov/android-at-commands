package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCSIMAPP extends ATcommand {
    public AtDolQCSIMAPP(Context ctx) {
        super("$QCSIMAPP", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CURRENT;
        mDescription = ctx.getString(R.string.at_dol_qcsimapp_description);
    }
}
