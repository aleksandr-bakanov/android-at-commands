package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtAmpC extends ATcommand {
    public AtAmpC(Context ctx) {
        super("&C", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CLEAN | AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_amp_c_description);
    }
}
