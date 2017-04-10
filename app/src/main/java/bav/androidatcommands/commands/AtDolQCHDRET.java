package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCHDRET extends ATcommand {
    public AtDolQCHDRET(Context ctx) {
        super("$QCHDRET", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_dol_qchdret_description);
    }
}
