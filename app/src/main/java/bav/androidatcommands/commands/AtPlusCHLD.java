package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCHLD extends ATcommand {
    public AtPlusCHLD() {
        super("+CHLD", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
