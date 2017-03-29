package bav.androidatcommands.commands;

public class AtDolCCLK extends ATcommand {
    public AtDolCCLK() {
        super("$CCLK", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
