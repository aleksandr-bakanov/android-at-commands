package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCUAD extends ATcommand {
    public AtPlusCUAD(Context ctx) {
        super("+CUAD", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE;
        mDescription = ctx.getString(R.string.at_plus_cuad_description);
    }
}
