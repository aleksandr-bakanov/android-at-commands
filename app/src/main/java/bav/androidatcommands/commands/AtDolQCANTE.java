package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCANTE extends ATcommand {
    public AtDolQCANTE(Context ctx) {
        super("$QCANTE", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CLEAN | AVAILABLE;
        mDescription = ctx.getString(R.string.at_dol_qcante_description);
    }
}
