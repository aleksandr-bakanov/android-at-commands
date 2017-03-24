package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusPACSP extends ATcommand {
    public AtPlusPACSP() {
        super("+PACSP", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
