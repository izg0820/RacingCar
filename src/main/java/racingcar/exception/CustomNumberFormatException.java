package racingcar.exception;

import racingcar.constant.ErrorMessage;

public class CustomNumberFormatException extends NumberFormatException {

    public CustomNumberFormatException(String message) {
        super(ErrorMessage.PREFIX.getMessage() + message);
    }
}
