package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCBIP extends ATcommand {
    public AtPlusCBIP() {
        super("+CBIP", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
