package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtCarGSN extends ATcommand {
    public AtCarGSN() {
        super("^GSN", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
