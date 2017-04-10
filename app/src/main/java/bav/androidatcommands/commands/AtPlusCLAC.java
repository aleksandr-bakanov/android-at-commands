package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCLAC extends ATcommand {
    public AtPlusCLAC(Context ctx) {
        super("+CLAC", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CLEAN | AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_plus_clac_description);
    }
}
