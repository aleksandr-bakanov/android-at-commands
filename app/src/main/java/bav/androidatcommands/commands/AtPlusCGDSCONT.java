package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCGDSCONT extends ATcommand {
    public AtPlusCGDSCONT(Context ctx) {
        super("+CGDSCONT", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE;
        mDescription = ctx.getString(R.string.at_plus_cgdscont_description);
    }
}
