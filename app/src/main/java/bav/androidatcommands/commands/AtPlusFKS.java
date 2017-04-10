package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusFKS extends ATcommand {
    public AtPlusFKS(Context ctx) {
        super("+FKS", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = ctx.getString(R.string.at_plus_fks_description);
    }
}
