package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCPREV extends ATcommand {
    public AtDolQCPREV(Context ctx) {
        super("$QCPREV", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CURRENT;
        mDescription = ctx.getString(R.string.at_dol_qcprev_description);
    }
}
