package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCHDRC extends ATcommand {
    public AtDolQCHDRC(Context ctx) {
        super("$QCHDRC", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_dol_qchdrc_description);
    }
}
