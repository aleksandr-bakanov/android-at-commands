package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtAmpW extends ATcommand {
    public AtAmpW(Context ctx) {
        super("&W", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_amp_w_description);
    }
}
