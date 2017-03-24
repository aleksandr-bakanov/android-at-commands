package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCGREG extends ATcommand {
    public AtPlusCGREG() {
        super("+CGREG", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
