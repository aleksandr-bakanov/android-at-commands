package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCGQREQ extends ATcommand {
    public AtPlusCGQREQ(Context ctx) {
        super("+CGQREQ", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_plus_cgqreq_description);
    }
}
