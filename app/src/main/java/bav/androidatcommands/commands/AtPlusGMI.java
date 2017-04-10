package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusGMI extends ATcommand {
    public AtPlusGMI(Context ctx) {
        super("+GMI", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CLEAN;
        mDescription = ctx.getString(R.string.at_plus_gmi_description);
    }
}
