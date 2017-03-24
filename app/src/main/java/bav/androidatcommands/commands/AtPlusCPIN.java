package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCPIN extends ATcommand {
    public AtPlusCPIN() {
        super("+CPIN", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
