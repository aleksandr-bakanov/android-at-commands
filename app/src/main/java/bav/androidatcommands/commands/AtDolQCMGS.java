package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCMGS extends ATcommand {
    public AtDolQCMGS(Context ctx) {
        super("$QCMGS", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_dol_qcmgs_description);
    }
}
