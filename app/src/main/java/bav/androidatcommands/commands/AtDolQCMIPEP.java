package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCMIPEP extends ATcommand {
    public AtDolQCMIPEP(Context ctx) {
        super("$QCMIPEP", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_dol_qcmipep_description);
    }
}
