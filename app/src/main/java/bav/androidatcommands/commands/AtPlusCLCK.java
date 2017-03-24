package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCLCK extends ATcommand {
    public AtPlusCLCK() {
        super("+CLCK", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
