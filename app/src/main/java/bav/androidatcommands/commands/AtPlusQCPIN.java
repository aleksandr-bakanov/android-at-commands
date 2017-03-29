package bav.androidatcommands.commands;

public class AtPlusQCPIN extends ATcommand {
    public AtPlusQCPIN() {
        super("+QCPIN", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
