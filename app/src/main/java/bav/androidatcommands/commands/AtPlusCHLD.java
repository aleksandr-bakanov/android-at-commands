package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCHLD extends ATcommand {
    public AtPlusCHLD(Context ctx) {
        super("+CHLD", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE;
        mDescription = ctx.getString(R.string.at_plus_chld_description);
    }
}
