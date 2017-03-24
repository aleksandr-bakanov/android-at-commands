package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtCarCPIN extends ATcommand {
    public AtCarCPIN() {
        super("^CPIN", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
