package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCDIP extends ATcommand {
    public AtPlusCDIP() {
        super("+CDIP", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
