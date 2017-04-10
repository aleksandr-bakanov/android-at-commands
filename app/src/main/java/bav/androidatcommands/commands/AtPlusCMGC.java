package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCMGC extends ATcommand {
    public AtPlusCMGC(Context ctx) {
        super("+CMGC", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_plus_cmgc_description);
    }
}
