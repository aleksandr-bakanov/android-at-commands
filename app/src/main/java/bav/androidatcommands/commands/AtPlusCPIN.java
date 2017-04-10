package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCPIN extends ATcommand {
    public AtPlusCPIN(Context ctx) {
        super("+CPIN", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_plus_cpin_description);
    }
}
