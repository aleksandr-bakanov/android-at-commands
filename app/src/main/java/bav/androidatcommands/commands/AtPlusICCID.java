package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusICCID extends ATcommand {
    public AtPlusICCID() {
        super("+ICCID", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
