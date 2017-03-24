package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCMUX extends ATcommand {
    public AtPlusCMUX() {
        super("+CMUX", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
