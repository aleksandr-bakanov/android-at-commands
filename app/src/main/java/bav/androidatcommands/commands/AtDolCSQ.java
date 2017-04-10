package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolCSQ extends ATcommand {
    public AtDolCSQ(Context ctx) {
        super("$CSQ", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CLEAN;
        mDescription = ctx.getString(R.string.at_dol_csq_description);
    }
}
