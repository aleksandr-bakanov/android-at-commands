package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCNMI extends ATcommand {
    public AtPlusCNMI() {
        super("+CNMI", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
