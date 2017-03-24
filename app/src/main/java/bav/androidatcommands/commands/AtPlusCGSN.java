package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCGSN extends ATcommand {
    public AtPlusCGSN() {
        super("+CGSN", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
