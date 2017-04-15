package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public interface IATcommand {
    String getDescription();
    String getCommand();
    int getTimeout();
    String getRawAnswerClean();
    String getRawAnswerAvailable();
    String getRawAnswerCurrent();
    void setRawAnswerClean(String rawAnswerClean);
    void setRawAnswerAvailable(String rawAnswerAvailable);
    void setRawAnswerCurrent(String rawAnswerCurrent);
    boolean isRunAllowed(int format);
    int getAllowedCommandFormats();
}
