package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCBOOTVER extends ATcommand {
    public AtDolQCBOOTVER(Context ctx) {
        super("$QCBOOTVER", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CLEAN | AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_dol_qcbootver_description);
    }
}
