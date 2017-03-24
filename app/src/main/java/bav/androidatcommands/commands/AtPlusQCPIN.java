package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusQCPIN extends ATcommand {
    public AtPlusQCPIN() {
        super("+QCPIN", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
