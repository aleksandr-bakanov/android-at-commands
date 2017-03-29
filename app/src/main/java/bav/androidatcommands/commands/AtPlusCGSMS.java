package bav.androidatcommands.commands;

public class AtPlusCGSMS extends ATcommand {
    public AtPlusCGSMS() {
        super("+CGSMS", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
