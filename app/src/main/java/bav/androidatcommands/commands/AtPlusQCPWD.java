package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusQCPWD extends ATcommand {
    public AtPlusQCPWD(Context ctx) {
        super("+QCPWD", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE;
        mDescription = ctx.getString(R.string.at_plus_qcpwd_description);
    }
}
