package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCMGW extends ATcommand {
    public AtDolQCMGW(Context ctx) {
        super("$QCMGW", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_dol_qcmgw_description);
    }
}
