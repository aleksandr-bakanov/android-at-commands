package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCCHV extends ATcommand {
    public AtDolQCCHV(Context ctx) {
        super("$QCCHV", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_dol_qcchv_description);
    }
}
