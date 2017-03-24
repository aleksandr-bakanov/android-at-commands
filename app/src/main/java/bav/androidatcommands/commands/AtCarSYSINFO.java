package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtCarSYSINFO extends ATcommand {
    public AtCarSYSINFO() {
        super("^SYSINFO", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
