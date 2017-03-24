package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusQCIMI extends ATcommand {
    public AtPlusQCIMI() {
        super("+QCIMI", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
