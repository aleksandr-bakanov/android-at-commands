package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtCarDSCI extends ATcommand {
    public AtCarDSCI(Context ctx) {
        super("^DSCI", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_car_dsci_description);
    }
}
