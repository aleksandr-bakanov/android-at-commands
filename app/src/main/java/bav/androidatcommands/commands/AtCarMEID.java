package bav.androidatcommands.commands;

public class AtCarMEID extends ATcommand {
    public AtCarMEID() {
        super("^MEID", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
