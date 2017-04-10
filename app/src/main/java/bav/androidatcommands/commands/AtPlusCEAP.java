package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCEAP extends ATcommand {
    public AtPlusCEAP(Context ctx) {
        super("+CEAP", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_plus_ceap_description);
    }
}
