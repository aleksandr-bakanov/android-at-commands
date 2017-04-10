package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtCarMEID extends ATcommand {
    public AtCarMEID(Context ctx) {
        super("^MEID", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CLEAN;
        mDescription = ctx.getString(R.string.at_car_meid_description);
    }
}
