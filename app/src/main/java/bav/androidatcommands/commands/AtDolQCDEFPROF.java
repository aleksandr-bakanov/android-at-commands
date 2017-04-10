package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCDEFPROF extends ATcommand {
    public AtDolQCDEFPROF(Context ctx) {
        super("$QCDEFPROF", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_dol_qcdefprof_description);
    }
}
