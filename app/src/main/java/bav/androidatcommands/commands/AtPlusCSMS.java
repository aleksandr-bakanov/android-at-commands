package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCSMS extends ATcommand {
    public AtPlusCSMS() {
        super("+CSMS", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
