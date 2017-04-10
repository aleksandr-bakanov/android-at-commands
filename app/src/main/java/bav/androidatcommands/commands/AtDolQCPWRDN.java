package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCPWRDN extends ATcommand {
    public AtDolQCPWRDN(Context ctx) {
        super("$QCPWRDN", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_dol_qcpwrdn_description);
    }
}
