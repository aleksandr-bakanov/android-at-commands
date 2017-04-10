package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCATMOD extends ATcommand {
    public AtDolQCATMOD(Context ctx) {
        super("$QCATMOD", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_dol_qcatmod_description);
    }
}
