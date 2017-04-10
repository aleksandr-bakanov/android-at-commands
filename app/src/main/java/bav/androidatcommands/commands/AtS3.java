package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtS3 extends ATcommand {
    public AtS3(Context ctx) {
        super("S3", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_s3_description);
    }
}
