package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusFTS extends ATcommand {
    public AtPlusFTS(Context ctx) {
        super("+FTS", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_plus_fts_description);
    }
}
