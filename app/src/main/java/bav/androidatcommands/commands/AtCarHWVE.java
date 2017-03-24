package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtCarHWVE extends ATcommand {
    public AtCarHWVE() {
        super("^HWVE", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
