package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusPZID extends ATcommand {
    public AtPlusPZID() {
        super("+PZID", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
