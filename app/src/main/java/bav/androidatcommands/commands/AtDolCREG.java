package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolCREG extends ATcommand {
    public AtDolCREG(Context ctx) {
        super("$CREG", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CURRENT | AVAILABLE;
        mDescription = ctx.getString(R.string.at_dol_creg_description);
    }
}
