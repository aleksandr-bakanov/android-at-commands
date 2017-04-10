package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtCarVOLT extends ATcommand {
    public AtCarVOLT(Context ctx) {
        super("^VOLT", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_car_volt_description);
    }
}
