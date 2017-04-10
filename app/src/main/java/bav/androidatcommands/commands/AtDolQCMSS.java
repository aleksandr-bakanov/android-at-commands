package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCMSS extends ATcommand {
    public AtDolQCMSS(Context ctx) {
        super("$QCMSS", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_dol_qcmss_description);
    }
}
