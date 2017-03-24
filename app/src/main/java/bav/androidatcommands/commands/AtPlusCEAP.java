package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCEAP extends ATcommand {
    public AtPlusCEAP() {
        super("+CEAP", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
