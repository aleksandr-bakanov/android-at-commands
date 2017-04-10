package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCMRUE extends ATcommand {
    public AtDolQCMRUE(Context ctx) {
        super("$QCMRUE", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_dol_qcmrue_description);
    }
}
