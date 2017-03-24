package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCGACT extends ATcommand {
    public AtPlusCGACT() {
        super("+CGACT", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
