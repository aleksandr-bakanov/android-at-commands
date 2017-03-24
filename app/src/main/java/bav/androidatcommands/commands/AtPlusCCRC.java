package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCCRC extends ATcommand {
    public AtPlusCCRC() {
        super("+CCRC", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
