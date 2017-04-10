package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCGCONTRDP extends ATcommand {
    public AtPlusCGCONTRDP(Context ctx) {
        super("+CGCONTRDP", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE;
        mDescription = ctx.getString(R.string.at_plus_cgcontrdp_description);
    }
}
