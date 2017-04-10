package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCPMS extends ATcommand {
    public AtDolQCPMS(Context ctx) {
        super("$QCPMS", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE;
        mDescription = ctx.getString(R.string.at_dol_qcpms_description);
    }
}
