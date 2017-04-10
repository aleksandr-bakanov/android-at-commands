package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtS104 extends ATcommand {
    public AtS104(Context ctx) {
        super("S104", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_s104_description);
    }
}
