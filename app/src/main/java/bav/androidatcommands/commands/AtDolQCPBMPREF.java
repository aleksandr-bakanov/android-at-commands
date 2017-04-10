package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCPBMPREF extends ATcommand {
    public AtDolQCPBMPREF(Context ctx) {
        super("$QCPBMPREF", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_dol_qcpbmpref_description);
    }
}
