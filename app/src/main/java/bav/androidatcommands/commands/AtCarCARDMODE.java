package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtCarCARDMODE extends ATcommand {
    public AtCarCARDMODE(Context ctx) {
        super("^CARDMODE", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CLEAN;
        mDescription = ctx.getString(R.string.at_car_cardmode_description);
    }
}
