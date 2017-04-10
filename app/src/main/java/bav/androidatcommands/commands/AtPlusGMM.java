package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusGMM extends ATcommand {
    public AtPlusGMM(Context ctx) {
        super("+GMM", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CLEAN;
        mDescription = ctx.getString(R.string.at_plus_gmm_description);
    }
}
