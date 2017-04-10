package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCMGD extends ATcommand {
    public AtDolQCMGD(Context ctx) {
        super("$QCMGD", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_dol_qcmgd_description);
    }
}
