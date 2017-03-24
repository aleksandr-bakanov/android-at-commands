package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCGEQOSRDP extends ATcommand {
    public AtPlusCGEQOSRDP() {
        super("+CGEQOSRDP", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
