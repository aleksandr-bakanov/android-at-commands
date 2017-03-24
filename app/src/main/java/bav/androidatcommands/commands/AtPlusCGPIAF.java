package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCGPIAF extends ATcommand {
    public AtPlusCGPIAF() {
        super("+CGPIAF", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
