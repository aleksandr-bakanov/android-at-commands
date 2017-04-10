package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCMGR extends ATcommand {
    public AtDolQCMGR(Context ctx) {
        super("$QCMGR", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_dol_qcmgr_description);
    }
}
