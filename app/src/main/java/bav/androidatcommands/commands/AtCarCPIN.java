package bav.androidatcommands.commands;

public class AtCarCPIN extends ATcommand {
    public AtCarCPIN() {
        super("^CPIN", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
