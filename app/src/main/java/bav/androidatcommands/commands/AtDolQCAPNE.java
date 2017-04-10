package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCAPNE extends ATcommand {
    public AtDolQCAPNE(Context ctx) {
        super("$QCAPNE", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE;
        mDescription = ctx.getString(R.string.at_dol_qcapne_description);
    }
}
