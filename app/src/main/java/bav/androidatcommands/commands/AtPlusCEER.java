package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCEER extends ATcommand {
    public AtPlusCEER(Context ctx) {
        super("+CEER", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CLEAN;
        mDescription = ctx.getString(R.string.at_plus_ceer_description);
    }
}
