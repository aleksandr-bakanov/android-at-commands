package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtSlaQ extends ATcommand {
    public AtSlaQ(Context ctx) {
        super("\\Q", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_sla_q_description);
    }
}
