package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCMGF extends ATcommand {
    public AtPlusCMGF(Context ctx) {
        super("+CMGF", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_plus_cmgf_description);
    }
}
