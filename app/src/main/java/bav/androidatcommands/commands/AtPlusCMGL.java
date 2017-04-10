package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCMGL extends ATcommand {
    public AtPlusCMGL(Context ctx) {
        super("+CMGL", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_plus_cmgl_description);
    }
}
