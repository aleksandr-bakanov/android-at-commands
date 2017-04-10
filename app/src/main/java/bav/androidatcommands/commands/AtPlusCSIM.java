package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCSIM extends ATcommand {
    public AtPlusCSIM(Context ctx) {
        super("+CSIM", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_plus_csim_description);
    }
}
