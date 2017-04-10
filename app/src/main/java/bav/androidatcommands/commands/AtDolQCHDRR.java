package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCHDRR extends ATcommand {
    public AtDolQCHDRR(Context ctx) {
        super("$QCHDRR", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_dol_qchdrr_description);
    }
}
