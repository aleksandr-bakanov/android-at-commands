package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCGEQREQ extends ATcommand {
    public AtPlusCGEQREQ(Context ctx) {
        super("+CGEQREQ", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_plus_cgeqreq_description);
    }
}
