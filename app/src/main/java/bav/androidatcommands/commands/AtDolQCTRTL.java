package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCTRTL extends ATcommand {
    public AtDolQCTRTL(Context ctx) {
        super("$QCTRTL", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_dol_qctrtl_description);
    }
}
