package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCMGD extends ATcommand {
    public AtPlusCMGD(Context ctx) {
        super("+CMGD", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_plus_cmgd_description);
    }
}
