package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCPINSTAT extends ATcommand {
    public AtDolQCPINSTAT(Context ctx) {
        super("$QCPINSTAT", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CURRENT;
        mDescription = ctx.getString(R.string.at_dol_qcpinstat_description);
    }
}
