package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCDV extends ATcommand {
    public AtPlusCDV(Context ctx) {
        super("+CDV", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_plus_cdv_description);
    }
}
