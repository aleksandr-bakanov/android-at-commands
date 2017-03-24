package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCGDCONT extends ATcommand {
    public AtPlusCGDCONT() {
        super("+CGDCONT", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
