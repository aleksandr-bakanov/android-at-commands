package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCVHU extends ATcommand {
    public AtPlusCVHU() {
        super("+CVHU", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
