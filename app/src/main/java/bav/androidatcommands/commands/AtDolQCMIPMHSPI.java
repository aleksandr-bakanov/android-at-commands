package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCMIPMHSPI extends ATcommand {
    public AtDolQCMIPMHSPI(Context ctx) {
        super("$QCMIPMHSPI", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_dol_qcmipmhspi_description);
    }
}
