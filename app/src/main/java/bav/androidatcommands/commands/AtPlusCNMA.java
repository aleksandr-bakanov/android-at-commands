package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCNMA extends ATcommand {
    public AtPlusCNMA(Context ctx) {
        super("+CNMA", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_plus_cnma_description);
    }
}
