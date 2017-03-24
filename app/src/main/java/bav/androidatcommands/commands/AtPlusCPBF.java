package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCPBF extends ATcommand {
    public AtPlusCPBF() {
        super("+CPBF", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
