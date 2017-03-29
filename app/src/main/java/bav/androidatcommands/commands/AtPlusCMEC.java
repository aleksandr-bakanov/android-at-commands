package bav.androidatcommands.commands;

public class AtPlusCMEC extends ATcommand {
    public AtPlusCMEC() {
        super("+CMEC", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
