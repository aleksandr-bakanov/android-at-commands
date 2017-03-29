package bav.androidatcommands.commands;

public class AtPlusPACSP extends ATcommand {
    public AtPlusPACSP() {
        super("+PACSP", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
