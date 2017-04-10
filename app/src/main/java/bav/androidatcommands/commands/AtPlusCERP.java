package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCERP extends ATcommand {
    public AtPlusCERP(Context ctx) {
        super("+CERP", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_plus_cerp_description);
    }
}
