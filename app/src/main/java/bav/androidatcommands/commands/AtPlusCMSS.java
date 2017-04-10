package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCMSS extends ATcommand {
    public AtPlusCMSS(Context ctx) {
        super("+CMSS", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_plus_cmss_description);
    }
}
