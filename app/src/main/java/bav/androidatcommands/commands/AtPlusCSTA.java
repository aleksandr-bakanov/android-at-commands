package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCSTA extends ATcommand {
    public AtPlusCSTA() {
        super("+CSTA", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
