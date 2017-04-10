package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class    AtPlusMV18R extends ATcommand {
    public AtPlusMV18R(Context ctx) {
        super("+MV18R", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_plus_mv18r_description);
    }
}
