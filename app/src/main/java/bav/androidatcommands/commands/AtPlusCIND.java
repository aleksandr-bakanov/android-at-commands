package bav.androidatcommands.commands;

public class AtPlusCIND extends ATcommand {
    public AtPlusCIND() {
        super("+CIND", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
