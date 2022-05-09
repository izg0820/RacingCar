package racingcar.model;

import racingcar.constant.CarStatus;
import racingcar.constant.Constant;
import racingcar.constant.ErrorMessage;
import racingcar.exception.CustomIllegalArgumentException;

public class Car {

    private final String name;
    private int position;

    public Car(String name, int position) {
        isValidate(name);
        this.name = name;
        this.position = position;
    }

    private void isValidate(String name) {
        validateCarNameLength(name);
        validateCarNameSpace(name);
    }

    private void validateCarNameSpace(String name) {
        if (name.contains(Constant.SPACE)) {
            throw new CustomIllegalArgumentException(ErrorMessage.CAR_NAME_SPACE.getValue());
        }
    }

    private void validateCarNameLength(String name) {
        if (name.length() > Constant.CAR_NAME_MAX_LENGTH || name.length() < Constant.CAR_NAME_MIN_LENGTH) {
            throw new CustomIllegalArgumentException(ErrorMessage.CAR_NAME_WRONG.getValue());
        }
    }

    public void setPosition(RandomNumber randomNumber) {
        if (randomNumber.goOrStop() == CarStatus.Go) {
            this.position++;
        }
    }

    public Integer getPosition() {
        return this.position;
    }

    public String getName() {
        return this.name;
    }
}
