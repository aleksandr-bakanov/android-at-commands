package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCOTC extends ATcommand {
    public AtDolQCOTC(Context ctx) {
        super("$QCOTC", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_dol_qcotc_description);
    }
}
