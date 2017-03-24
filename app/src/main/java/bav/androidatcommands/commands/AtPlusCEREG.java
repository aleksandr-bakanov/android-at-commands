package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCEREG extends ATcommand {
    public AtPlusCEREG() {
        super("+CEREG", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
