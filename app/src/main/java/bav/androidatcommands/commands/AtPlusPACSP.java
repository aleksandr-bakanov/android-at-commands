package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusPACSP extends ATcommand {
    public AtPlusPACSP(Context ctx) {
        super("+PACSP", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_plus_pacsp_description);
    }
}
