package bav.androidatcommands.commands;

public class AtCarHWVER extends ATcommand {
    public AtCarHWVER() {
        super("^HWVER", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
