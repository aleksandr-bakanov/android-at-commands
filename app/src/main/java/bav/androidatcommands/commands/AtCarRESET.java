package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtCarRESET extends ATcommand {
    public AtCarRESET() {
        super("^RESET", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
