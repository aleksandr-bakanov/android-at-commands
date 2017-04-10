package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCHDRT extends ATcommand {
    public AtDolQCHDRT(Context ctx) {
        super("$QCHDRT", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_dol_qchdrt_description);
    }
}
