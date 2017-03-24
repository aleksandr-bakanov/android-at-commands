package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCCSQ extends ATcommand {
    public AtPlusCCSQ() {
        super("+CCSQ", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
