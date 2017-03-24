package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCMEC extends ATcommand {
    public AtPlusCMEC() {
        super("+CMEC", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
