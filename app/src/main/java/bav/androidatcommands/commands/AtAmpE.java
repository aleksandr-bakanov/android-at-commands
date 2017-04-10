package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtAmpE extends ATcommand {
    public AtAmpE(Context ctx) {
        super("&E", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CLEAN | AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_amp_e_description);
    }
}
