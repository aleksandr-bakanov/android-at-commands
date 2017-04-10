package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCMGW extends ATcommand {
    public AtPlusCMGW(Context ctx) {
        super("+CMGW", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_plus_cmgw_description);
    }
}
