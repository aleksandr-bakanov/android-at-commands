package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCPOL extends ATcommand {
    public AtPlusCPOL() {
        super("+CPOL", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
