package racingcar.constant;

public enum ErrorMessage {

    PREFIX("[ERROR] "),
    CAR_NAME_WRONG("자동차 이름은 1자 이상 5자 이하입니다."),
    CAR_NAME_SPACE("자동차 이름에 공백이 포함되어 있습니다."),
    CAR_NAME_DUPLICATE("중복된 자동차 이름이 있습니다."),
    REPEAT_TIME_NON_POSITIVE("시도할 횟수는 0보다 커야 합니다."),
    REPEAT_TIME_NON_NUMERIC("시도할 횟수는 숫자여야 합니다."),

    RACING_CAR_NOT_EXISTING("자동차가 존재하지 않습니다.");

    private String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
