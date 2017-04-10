package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusQCPIN extends ATcommand {
    public AtPlusQCPIN(Context ctx) {
        super("+QCPIN", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_plus_qcpin_description);
    }
}
