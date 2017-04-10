package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCMGR extends ATcommand {
    public AtPlusCMGR(Context ctx) {
        super("+CMGR", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_plus_cmgr_description);
    }
}
