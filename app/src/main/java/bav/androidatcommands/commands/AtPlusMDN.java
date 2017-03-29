package bav.androidatcommands.commands;

public class AtPlusMDN extends ATcommand {
    public AtPlusMDN() {
        super("+MDN", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
