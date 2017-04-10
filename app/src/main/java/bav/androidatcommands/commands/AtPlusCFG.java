package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCFG extends ATcommand {
    public AtPlusCFG(Context ctx) {
        super("+CFG", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CURRENT;
        mDescription = ctx.getString(R.string.at_plus_cfg_description);
    }
}
