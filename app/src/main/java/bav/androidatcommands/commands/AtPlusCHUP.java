package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCHUP extends ATcommand {
    public AtPlusCHUP() {
        super("+CHUP", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
