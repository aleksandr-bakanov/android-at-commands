package bav.androidatcommands.commands;

public class AtPlusCNMI extends ATcommand {
    public AtPlusCNMI() {
        super("+CNMI", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
