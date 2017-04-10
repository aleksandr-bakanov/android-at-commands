package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCHV0 extends ATcommand {
    public AtPlusCHV0(Context ctx) {
        super("+CHV0", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_plus_chv0_description);
    }
}
