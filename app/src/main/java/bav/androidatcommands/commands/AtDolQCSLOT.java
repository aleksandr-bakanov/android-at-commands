package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCSLOT extends ATcommand {
    public AtDolQCSLOT(Context ctx) {
        super("$QCSLOT", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_dol_qcslot_description);
    }
}
