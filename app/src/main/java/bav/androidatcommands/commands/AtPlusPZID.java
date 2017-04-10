package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusPZID extends ATcommand {
    public AtPlusPZID(Context ctx) {
        super("+PZID", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CURRENT;
        mDescription = ctx.getString(R.string.at_plus_pzid_description);
    }
}
