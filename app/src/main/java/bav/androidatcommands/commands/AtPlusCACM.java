package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCACM extends ATcommand {
    public AtPlusCACM(Context ctx) {
        super("+CACM", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_plus_cacm_description);
    }
}
