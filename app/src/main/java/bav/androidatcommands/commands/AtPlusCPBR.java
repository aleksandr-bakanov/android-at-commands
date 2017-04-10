package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCPBR extends ATcommand {
    public AtPlusCPBR(Context ctx) {
        super("+CPBR", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE;
        mDescription = ctx.getString(R.string.at_plus_cpbr_description);
    }
}
