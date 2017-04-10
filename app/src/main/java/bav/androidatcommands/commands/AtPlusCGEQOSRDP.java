package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCGEQOSRDP extends ATcommand {
    public AtPlusCGEQOSRDP(Context ctx) {
        super("+CGEQOSRDP", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE;
        mDescription = ctx.getString(R.string.at_plus_cgeqosrdp_description);
    }
}
