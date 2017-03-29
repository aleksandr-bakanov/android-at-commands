package bav.androidatcommands.commands;

public class AtPlusCPWD extends ATcommand {
    public AtPlusCPWD() {
        super("+CPWD", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
