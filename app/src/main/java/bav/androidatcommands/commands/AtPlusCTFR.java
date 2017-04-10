package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCTFR extends ATcommand {
    public AtPlusCTFR(Context ctx) {
        super("+CTFR", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_plus_ctfr_description);
    }
}
