package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCPBS extends ATcommand {
    public AtPlusCPBS() {
        super("+CPBS", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
