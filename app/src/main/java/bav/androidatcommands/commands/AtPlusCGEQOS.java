package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCGEQOS extends ATcommand {
    public AtPlusCGEQOS() {
        super("+CGEQOS", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
