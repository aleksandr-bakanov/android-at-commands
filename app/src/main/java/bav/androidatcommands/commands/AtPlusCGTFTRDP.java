package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCGTFTRDP extends ATcommand {
    public AtPlusCGTFTRDP(Context ctx) {
        super("+CGTFTRDP", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE;
        mDescription = ctx.getString(R.string.at_plus_cgtftrdp_description);
    }
}
