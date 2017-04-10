package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusICCID extends ATcommand {
    public AtPlusICCID(Context ctx) {
        super("+ICCID", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CLEAN;
        mDescription = ctx.getString(R.string.at_plus_iccid_description);
    }
}
