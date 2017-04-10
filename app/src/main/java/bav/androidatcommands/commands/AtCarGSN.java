package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtCarGSN extends ATcommand {
    public AtCarGSN(Context ctx) {
        super("^GSN", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_car_gsn_description);
    }
}
