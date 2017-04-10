package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCMIPGETP extends ATcommand {
    public AtDolQCMIPGETP(Context ctx) {
        super("$QCMIPGETP", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CLEAN | AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_dol_qcmipgetp_description);
    }
}
