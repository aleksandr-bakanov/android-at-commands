package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCCLAC extends ATcommand {
    public AtDolQCCLAC(Context ctx) {
        super("$QCCLAC", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CLEAN | AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_dol_qcclac_description);
    }
}
