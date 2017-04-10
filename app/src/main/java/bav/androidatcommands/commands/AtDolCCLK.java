package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolCCLK extends ATcommand {
    public AtDolCCLK(Context ctx) {
        super("$CCLK", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CURRENT;
        mDescription = ctx.getString(R.string.at_dol_cclk_description);
    }
}
