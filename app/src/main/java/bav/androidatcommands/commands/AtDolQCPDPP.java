package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCPDPP extends ATcommand {
    public AtDolQCPDPP(Context ctx) {
        super("$QCPDPP", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_dol_qcpdpp_description);
    }
}
