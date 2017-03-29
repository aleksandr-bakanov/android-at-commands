package bav.androidatcommands.commands;

public class AtPlusCIMI extends ATcommand {
    public AtPlusCIMI() {
        super("+CIMI", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
