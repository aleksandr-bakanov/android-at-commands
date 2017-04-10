package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCMIPMASSX extends ATcommand {
    public AtDolQCMIPMASSX(Context ctx) {
        super("$QCMIPMASSX", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_dol_qcmipmassx_description);
    }
}
