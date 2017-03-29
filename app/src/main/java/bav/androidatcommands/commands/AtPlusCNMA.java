package bav.androidatcommands.commands;

public class AtPlusCNMA extends ATcommand {
    public AtPlusCNMA() {
        super("+CNMA", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
