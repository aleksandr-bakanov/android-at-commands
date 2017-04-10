package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCPDPLT extends ATcommand {
    public AtDolQCPDPLT(Context ctx) {
        super("$QCPDPLT", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_dol_qcpdplt_description);
    }
}
