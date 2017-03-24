package bav.androidatcommands.commands;

/**
 * Created by bav on 20.03.2017.
 */

public class AtI extends ATcommand {
    public AtI() {
        super("ATI", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mDescription = "Identification information\n" +
                "Causes the DCE (Data Communications Equipment) to transmit one or more lines of " +
                "information text, determined by the manufacturer, followed by a final result code.";
    }
}
