package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCMIPMASPI extends ATcommand {
    public AtDolQCMIPMASPI(Context ctx) {
        super("$QCMIPMASPI", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_dol_qcmipmaspi_description);
    }
}
