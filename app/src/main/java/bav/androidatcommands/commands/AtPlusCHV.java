package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCHV extends ATcommand {
    public AtPlusCHV(Context ctx) {
        super("+CHV", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_plus_chv_description);
    }
}
