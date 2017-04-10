package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCMIPMHSSX extends ATcommand {
    public AtDolQCMIPMHSSX(Context ctx) {
        super("$QCMIPMHSSX", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_dol_qcmipmhssx_description);
    }
}
