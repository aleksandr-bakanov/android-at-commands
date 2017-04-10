package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtCarHDRCSQ extends ATcommand {
    public AtCarHDRCSQ(Context ctx) {
        super("^HDRCSQ", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_car_hdrcsq_description);
    }
}
