package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCPDPCFGE extends ATcommand {
    public AtDolQCPDPCFGE(Context ctx) {
        super("$QCPDPCFGE", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_dol_qcpdpcfge_description);
    }
}
