package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtAmpF extends ATcommand {
    public AtAmpF(Context ctx) {
        super("&F", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_amp_f_description);
    }
}
