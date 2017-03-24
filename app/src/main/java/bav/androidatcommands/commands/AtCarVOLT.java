package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtCarVOLT extends ATcommand {
    public AtCarVOLT() {
        super("^VOLT", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
