package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCGEQMIN extends ATcommand {
    public AtPlusCGEQMIN(Context ctx) {
        super("+CGEQMIN", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_plus_cgeqmin_description);
    }
}
