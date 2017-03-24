package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCNMA extends ATcommand {
    public AtPlusCNMA() {
        super("+CNMA", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
