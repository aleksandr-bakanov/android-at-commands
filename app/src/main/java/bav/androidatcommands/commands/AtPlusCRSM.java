package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCRSM extends ATcommand {
    public AtPlusCRSM() {
        super("+CRSM", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
