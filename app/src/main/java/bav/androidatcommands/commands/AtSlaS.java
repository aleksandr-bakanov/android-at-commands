package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtSlaS extends ATcommand {
    public AtSlaS(Context ctx) {
        super("\\S", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_sla_s_description);
    }
}
