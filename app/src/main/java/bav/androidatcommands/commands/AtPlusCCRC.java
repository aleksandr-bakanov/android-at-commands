package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCCRC extends ATcommand {
    public AtPlusCCRC(Context ctx) {
        super("+CCRC", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_plus_ccrc_description);
    }
}
