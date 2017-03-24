package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtCarCGSN extends ATcommand {
    public AtCarCGSN() {
        super("^CGSN", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
