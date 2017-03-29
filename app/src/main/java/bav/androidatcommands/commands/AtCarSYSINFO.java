package bav.androidatcommands.commands;

public class AtCarSYSINFO extends ATcommand {
    public AtCarSYSINFO() {
        super("^SYSINFO", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
