package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCDNSP extends ATcommand {
    public AtDolQCDNSP(Context ctx) {
        super("$QCDNSP", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CURRENT;
        mDescription = ctx.getString(R.string.at_dol_qcdnsp_description);
    }
}
