package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCGEQREQ extends ATcommand {
    public AtPlusCGEQREQ() {
        super("+CGEQREQ", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
