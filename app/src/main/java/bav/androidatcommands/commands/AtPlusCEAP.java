package bav.androidatcommands.commands;

public class AtPlusCEAP extends ATcommand {
    public AtPlusCEAP() {
        super("+CEAP", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
