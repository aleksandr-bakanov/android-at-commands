package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCPAS extends ATcommand {
    public AtPlusCPAS() {
        super("+CPAS", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
