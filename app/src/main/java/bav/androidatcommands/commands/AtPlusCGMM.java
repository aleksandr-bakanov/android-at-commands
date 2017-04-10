package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCGMM extends ATcommand {
    public AtPlusCGMM(Context ctx) {
        super("+CGMM", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CLEAN;
        mDescription = ctx.getString(R.string.at_plus_cgmm_description);
    }
}
