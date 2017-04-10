package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCDNSS extends ATcommand {
    public AtDolQCDNSS(Context ctx) {
        super("$QCDNSS", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CURRENT;
        mDescription = ctx.getString(R.string.at_dol_qcdnss_description);
    }
}
