package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtCarCGSN extends ATcommand {
    public AtCarCGSN(Context ctx) {
        super("^CGSN", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_car_cgsn_description);
    }
}
