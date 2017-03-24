package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtDolCCLK extends ATcommand {
    public AtDolCCLK() {
        super("$CCLK", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
