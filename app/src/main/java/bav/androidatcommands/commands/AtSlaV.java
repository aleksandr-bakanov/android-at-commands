package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtSlaV extends ATcommand {
    public AtSlaV(Context ctx) {
        super("\\V", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_sla_v_description);
    }
}
