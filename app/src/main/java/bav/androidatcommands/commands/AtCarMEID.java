package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtCarMEID extends ATcommand {
    public AtCarMEID() {
        super("^MEID", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
