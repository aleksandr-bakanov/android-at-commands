package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusQCLCK extends ATcommand {
    public AtPlusQCLCK(Context ctx) {
        super("+QCLCK", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE;
        mDescription = ctx.getString(R.string.at_plus_qclck_description);
    }
}
