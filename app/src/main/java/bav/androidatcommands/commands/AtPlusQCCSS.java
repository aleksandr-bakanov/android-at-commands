package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusQCCSS extends ATcommand {
    public AtPlusQCCSS(Context ctx) {
        super("+QCCSS", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_plus_qccss_description);
    }
}
