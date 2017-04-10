package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCCTM extends ATcommand {
    public AtDolQCCTM(Context ctx) {
        super("$QCCTM", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_dol_qcctm_description);
    }
}
