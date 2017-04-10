package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtCarPREFMODE extends ATcommand {
    public AtCarPREFMODE(Context ctx) {
        super("^PREFMODE", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_car_prefmode_description);
    }
}
