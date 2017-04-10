package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCRSRQ extends ATcommand {
    public AtDolQCRSRQ(Context ctx) {
        super("$QCRSRQ", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CURRENT;
        mDescription = ctx.getString(R.string.at_dol_qcrsrq_description);
    }
}
