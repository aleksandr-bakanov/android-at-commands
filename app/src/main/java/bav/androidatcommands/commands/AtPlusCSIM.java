package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCSIM extends ATcommand {
    public AtPlusCSIM() {
        super("+CSIM", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
