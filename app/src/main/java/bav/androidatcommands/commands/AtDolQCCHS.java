package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCCHS extends ATcommand {
    public AtDolQCCHS(Context ctx) {
        super("$QCCHS", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_dol_qcchs_description);
    }
}
