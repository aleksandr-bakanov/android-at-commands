package bav.androidatcommands.commands;

public class AtPlusCGMI extends ATcommand {
    public AtPlusCGMI() {
        super("+CGMI", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
