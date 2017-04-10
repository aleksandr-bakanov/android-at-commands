package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCSCRM extends ATcommand {
    public AtDolQCSCRM(Context ctx) {
        super("$QCSCRM", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_dol_qcscrm_description);
    }
}
