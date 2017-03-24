package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCRLP extends ATcommand {
    public AtPlusCRLP() {
        super("+CRLP", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}
