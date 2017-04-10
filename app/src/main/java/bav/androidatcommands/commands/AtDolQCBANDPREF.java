package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCBANDPREF extends ATcommand {
    public AtDolQCBANDPREF(Context ctx) {
        super("$QCBANDPREF", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE;
        mDescription = ctx.getString(R.string.at_dol_qcbandpref_description);
    }
}
