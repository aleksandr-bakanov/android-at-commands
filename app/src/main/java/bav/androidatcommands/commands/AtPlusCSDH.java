package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCSDH extends ATcommand {
    public AtPlusCSDH() {
        super("+CSDH", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
