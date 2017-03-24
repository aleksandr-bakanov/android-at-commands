package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusMDN extends ATcommand {
    public AtPlusMDN() {
        super("+MDN", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
