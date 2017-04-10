package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCNMI extends ATcommand {
    public AtPlusCNMI(Context ctx) {
        super("+CNMI", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_plus_cnmi_description);
    }
}
