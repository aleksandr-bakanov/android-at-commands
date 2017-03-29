package bav.androidatcommands.commands;

public class AtCarVOLT extends ATcommand {
    public AtCarVOLT() {
        super("^VOLT", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
