package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCCLR extends ATcommand {
    public AtDolQCCLR(Context ctx) {
        super("$QCCLR", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_dol_qcclr_description);
    }
}
