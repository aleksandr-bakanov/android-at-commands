package bav.androidatcommands.commands;

public class AtPlusCGEQOS extends ATcommand {
    public AtPlusCGEQOS() {
        super("+CGEQOS", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
