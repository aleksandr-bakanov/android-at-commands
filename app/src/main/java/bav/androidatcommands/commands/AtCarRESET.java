package bav.androidatcommands.commands;

public class AtCarRESET extends ATcommand {
    public AtCarRESET() {
        super("^RESET", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
