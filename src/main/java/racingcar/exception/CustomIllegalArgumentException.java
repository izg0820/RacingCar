package racingcar.exception;

import racingcar.constant.ErrorMessage;

public class CustomIllegalArgumentException extends IllegalArgumentException {

    public CustomIllegalArgumentException(String message) {
        super(ErrorMessage.PREFIX.getMessage() + message);
    }
}

