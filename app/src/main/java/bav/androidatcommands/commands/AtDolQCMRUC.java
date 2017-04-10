package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCMRUC extends ATcommand {
    public AtDolQCMRUC(Context ctx) {
        super("$QCMRUC", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_dol_qcmruc_description);
    }
}
