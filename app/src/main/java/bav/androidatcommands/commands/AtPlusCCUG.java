package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCCUG extends ATcommand {
    public AtPlusCCUG(Context ctx) {
        super("+CCUG", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CURRENT;
        mDescription = ctx.getString(R.string.at_plus_ccug_description);
    }
}
