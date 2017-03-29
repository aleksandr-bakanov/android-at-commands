package bav.androidatcommands.commands;

public class AtPlusCPIN extends ATcommand {
    public AtPlusCPIN() {
        super("+CPIN", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
