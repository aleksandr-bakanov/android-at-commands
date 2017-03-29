package bav.androidatcommands.commands;

public class AtPlusCSMS extends ATcommand {
    public AtPlusCSMS() {
        super("+CSMS", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
