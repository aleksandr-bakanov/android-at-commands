package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusGCAP extends ATcommand {
    public AtPlusGCAP(Context ctx) {
        super("+GCAP", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CLEAN;
        mDescription = ctx.getString(R.string.at_plus_gcap_description);
    }
}
