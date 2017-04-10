package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCGCMOD extends ATcommand {
    public AtPlusCGCMOD(Context ctx) {
        super("+CGCMOD", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE;
        mDescription = ctx.getString(R.string.at_plus_cgcmod_description);
    }
}
