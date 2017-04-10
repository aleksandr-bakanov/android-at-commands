package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCDMR extends ATcommand {
    public AtDolQCDMR(Context ctx) {
        super("$QCDMR", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_dol_qcdmr_description);
    }
}
