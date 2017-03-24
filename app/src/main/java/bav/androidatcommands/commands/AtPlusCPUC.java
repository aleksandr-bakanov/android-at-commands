package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCPUC extends ATcommand {
    public AtPlusCPUC() {
        super("+CPUC", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
