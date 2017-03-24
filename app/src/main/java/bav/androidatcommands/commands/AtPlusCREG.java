package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCREG extends ATcommand {
    public AtPlusCREG() {
        super("+CREG", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
