package bav.androidatcommands.commands;

public class AtPlusCBIP extends ATcommand {
    public AtPlusCBIP() {
        super("+CBIP", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
