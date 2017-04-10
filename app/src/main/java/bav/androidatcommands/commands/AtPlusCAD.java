package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusCAD extends ATcommand {
    public AtPlusCAD(Context ctx) {
        super("+CAD", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CLEAN | AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_plus_cad_description);
    }
}
