package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCGMI extends ATcommand {
    public AtPlusCGMI() {
        super("+CGMI", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
