package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusQCIMI extends ATcommand {
    public AtPlusQCIMI(Context ctx) {
        super("+QCIMI", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CLEAN | AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_plus_qcimi_description);
    }
}
