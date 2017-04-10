package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCHWREV extends ATcommand {
    public AtDolQCHWREV(Context ctx) {
        super("$QCHWREV", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CLEAN;
        mDescription = ctx.getString(R.string.at_dol_qchwrev_description);
    }
}
