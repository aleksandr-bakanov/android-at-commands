package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCACM extends ATcommand {
    public AtPlusCACM() {
        super("+CACM", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
