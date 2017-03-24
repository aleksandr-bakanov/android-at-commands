package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtDolQCSYSMODE extends ATcommand {
    public AtDolQCSYSMODE() {
        super("$QCSYSMODE", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
