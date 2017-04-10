package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCQOSPRI extends ATcommand {
    public AtDolQCQOSPRI(Context ctx) {
        super("$QCQOSPRI", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_dol_qcospri_description);
    }
}
