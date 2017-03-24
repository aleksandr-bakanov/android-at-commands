package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtCarHDRCSQ extends ATcommand {
    public AtCarHDRCSQ() {
        super("^HDRCSQ", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
