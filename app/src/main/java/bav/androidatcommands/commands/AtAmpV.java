package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtAmpV extends ATcommand {
    public AtAmpV(Context ctx) {
        super("&V", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CLEAN;
        mDescription = ctx.getString(R.string.at_amp_v_description);
    }
}
