package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCSDH extends ATcommand {
    public AtPlusCSDH(Context ctx) {
        super("+CSDH", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_plus_csdh_description);
    }
}
