package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtCarHWVER extends ATcommand {
    public AtCarHWVER(Context ctx) {
        super("^HWVER", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CLEAN;
        mDescription = ctx.getString(R.string.at_car_hwver_description);
    }
}
