package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCPDPIMSCFGE extends ATcommand {
    public AtDolQCPDPIMSCFGE(Context ctx) {
        super("$QCPDPIMSCFGE", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_dol_qcpdpimscfge_description);
    }
}
