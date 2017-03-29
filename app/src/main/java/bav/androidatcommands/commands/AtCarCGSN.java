package bav.androidatcommands.commands;

public class AtCarCGSN extends ATcommand {
    public AtCarCGSN() {
        super("^CGSN", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
