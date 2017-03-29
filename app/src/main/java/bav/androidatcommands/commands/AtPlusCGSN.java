package bav.androidatcommands.commands;

public class AtPlusCGSN extends ATcommand {
    public AtPlusCGSN() {
        super("+CGSN", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
