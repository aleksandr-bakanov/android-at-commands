package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusGMR extends ATcommand {
    public AtPlusGMR(Context ctx) {
        super("+GMR", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CLEAN;
        mDescription = ctx.getString(R.string.at_plus_gmr_description);
    }
}
