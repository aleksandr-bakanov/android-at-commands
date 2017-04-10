package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCGDCONT extends ATcommand {
    public AtPlusCGDCONT(Context ctx) {
        super("+CGDCONT", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE;
        mDescription = ctx.getString(R.string.at_plus_cgdcont_description);
    }
}
