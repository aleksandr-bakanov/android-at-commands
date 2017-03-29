package bav.androidatcommands.commands;

public class AtPlusCCLK extends ATcommand {
    public AtPlusCCLK() {
        super("+CCLK", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
