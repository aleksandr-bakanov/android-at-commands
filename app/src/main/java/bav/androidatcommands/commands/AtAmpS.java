package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtAmpS extends ATcommand {
    public AtAmpS(Context ctx) {
        super("&S", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_amp_s_description);
    }
}
