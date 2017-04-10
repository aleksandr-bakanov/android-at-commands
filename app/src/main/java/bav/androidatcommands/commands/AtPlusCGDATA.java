package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCGDATA extends ATcommand {
    public AtPlusCGDATA(Context ctx) {
        super("+CGDATA", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE;
        mDescription = ctx.getString(R.string.at_plus_cgdata_description);
    }
}
