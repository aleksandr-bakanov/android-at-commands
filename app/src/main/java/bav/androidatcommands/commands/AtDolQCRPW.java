package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCRPW extends ATcommand {
    public AtDolQCRPW(Context ctx) {
        super("$QCRPW", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CLEAN;
        mDescription = ctx.getString(R.string.at_dol_qcrpw_description);
    }
}
