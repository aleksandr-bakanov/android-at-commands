package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCGPIAF extends ATcommand {
    public AtPlusCGPIAF(Context ctx) {
        super("+CGPIAF", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_plus_cgpiaf_description);
    }
}
