package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCRSM extends ATcommand {
    public AtPlusCRSM(Context ctx) {
        super("+CRSM", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_plus_crsm_description);
    }
}
