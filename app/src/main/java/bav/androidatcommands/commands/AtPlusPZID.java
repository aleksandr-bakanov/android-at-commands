package bav.androidatcommands.commands;

public class AtPlusPZID extends ATcommand {
    public AtPlusPZID() {
        super("+PZID", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
