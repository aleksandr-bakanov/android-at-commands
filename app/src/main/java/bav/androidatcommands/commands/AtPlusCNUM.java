package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCNUM extends ATcommand {
    public AtPlusCNUM() {
        super("+CNUM", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
