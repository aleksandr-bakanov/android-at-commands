package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCMGC extends ATcommand {
    public AtPlusCMGC() {
        super("+CMGC", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
