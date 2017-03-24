package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCIMI extends ATcommand {
    public AtPlusCIMI() {
        super("+CIMI", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
