package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusMR extends ATcommand {
    public AtPlusMR(Context ctx) {
        super("+MR", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_plus_mr_description);
    }
}
