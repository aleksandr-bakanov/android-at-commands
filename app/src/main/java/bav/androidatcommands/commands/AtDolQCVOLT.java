package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCVOLT extends ATcommand {
    public AtDolQCVOLT(Context ctx) {
        super("$QCVOLT", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CLEAN;
        mDescription = ctx.getString(R.string.at_dol_qcvolt_description);
    }
}
