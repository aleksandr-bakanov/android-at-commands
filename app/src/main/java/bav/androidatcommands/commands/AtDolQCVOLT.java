package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtDolQCVOLT extends ATcommand {
    public AtDolQCVOLT() {
        super("$QCVOLT", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
