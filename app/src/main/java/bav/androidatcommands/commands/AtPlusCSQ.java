package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCSQ extends ATcommand {
    public AtPlusCSQ(Context ctx) {
        super("+CSQ", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CLEAN | AVAILABLE;
        mDescription = ctx.getString(R.string.at_plus_csq_description);
    }
}
