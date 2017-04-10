package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusFBS extends ATcommand {
    public AtPlusFBS(Context ctx) {
        super("+FBS", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CURRENT;
        mDescription = ctx.getString(R.string.at_plus_fbs_description);
    }
}
