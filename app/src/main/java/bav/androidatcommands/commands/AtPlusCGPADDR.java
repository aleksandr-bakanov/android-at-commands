package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCGPADDR extends ATcommand {
    public AtPlusCGPADDR(Context ctx) {
        super("+CGPADDR", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE;
        mDescription = ctx.getString(R.string.at_plus_cgpaddr_description);
    }
}
