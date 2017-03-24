package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtCarDSCI extends ATcommand {
    public AtCarDSCI() {
        super("^DSCI", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
