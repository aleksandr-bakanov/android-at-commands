package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCHUP extends ATcommand {
    public AtPlusCHUP(Context ctx) {
        super("+CHUP", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_plus_chup_description);
    }
}
