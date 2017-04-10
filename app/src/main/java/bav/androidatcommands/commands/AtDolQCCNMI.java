package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCCNMI extends ATcommand {
    public AtDolQCCNMI(Context ctx) {
        super("$QCCNMI", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_dol_qccnmi_description);
    }
}
