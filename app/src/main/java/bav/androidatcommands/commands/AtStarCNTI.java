package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtStarCNTI extends ATcommand {
    public AtStarCNTI(Context ctx) {
        super("*CNTI", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_star_cnti_description);
    }
}
