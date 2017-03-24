package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCSTF extends ATcommand {
    public AtPlusCSTF() {
        super("+CSTF", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
