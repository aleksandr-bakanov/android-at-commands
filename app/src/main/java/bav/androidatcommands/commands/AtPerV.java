package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPerV extends ATcommand {
    public AtPerV(Context ctx) {
        super("%V", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_per_v_description);
    }
}
