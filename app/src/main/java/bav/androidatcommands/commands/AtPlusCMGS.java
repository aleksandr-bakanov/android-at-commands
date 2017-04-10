package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCMGS extends ATcommand {
    public AtPlusCMGS(Context ctx) {
        super("+CMGS", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_plus_cmgs_description);
    }
}
