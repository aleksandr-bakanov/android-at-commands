package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCSIMSTAT extends ATcommand {
    public AtDolQCSIMSTAT(Context ctx) {
        super("$QCSIMSTAT", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CURRENT;
        mDescription = ctx.getString(R.string.at_dol_qcsimstat_description);
    }
}
