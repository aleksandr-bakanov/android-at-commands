package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtZ extends ATcommand {
    public AtZ(Context ctx) {
        super("Z", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_z_description);
    }
}
