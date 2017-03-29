package bav.androidatcommands.commands;

public class AtCarSYSCONFIG extends ATcommand {
    public AtCarSYSCONFIG() {
        super("^SYSCONFIG", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
