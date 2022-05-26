package racingcar.exception;

import racingcar.constant.ErrorMessage;

public class CustomIllegalStateException extends IllegalStateException {

    public CustomIllegalStateException(String message) {
        super(ErrorMessage.PREFIX.getMessage() + message);
    }
}

