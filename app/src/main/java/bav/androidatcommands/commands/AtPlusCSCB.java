package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCSCB extends ATcommand {
    public AtPlusCSCB() {
        super("+CSCB", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
