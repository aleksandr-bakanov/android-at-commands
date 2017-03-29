package bav.androidatcommands.commands;

public class AtPlusICCID extends ATcommand {
    public AtPlusICCID() {
        super("+ICCID", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
