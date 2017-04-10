package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCGSCONTRDP extends ATcommand {
    public AtPlusCGSCONTRDP(Context ctx) {
        super("+CGSCONTRDP", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE;
        mDescription = ctx.getString(R.string.at_plus_cgscontrdp_description);
    }
}
