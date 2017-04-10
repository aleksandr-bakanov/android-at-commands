package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCBC extends ATcommand {
    public AtPlusCBC(Context ctx) {
        super("+CBC", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CLEAN | AVAILABLE;
        mDescription = ctx.getString(R.string.at_plus_cbc_description);
    }
}
