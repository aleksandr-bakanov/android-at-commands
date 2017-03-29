package bav.androidatcommands.commands;

public class AtCarDSCI extends ATcommand {
    public AtCarDSCI() {
        super("^DSCI", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
