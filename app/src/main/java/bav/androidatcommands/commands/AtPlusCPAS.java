package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCPAS extends ATcommand {
    public AtPlusCPAS(Context ctx) {
        super("+CPAS", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CLEAN | AVAILABLE;
        mDescription = ctx.getString(R.string.at_plus_cpas_description);
    }
}
