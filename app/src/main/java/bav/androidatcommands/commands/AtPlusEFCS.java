package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusEFCS extends ATcommand {
    public AtPlusEFCS() {
        super("+EFCS", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
