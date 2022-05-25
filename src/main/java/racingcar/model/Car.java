package racingcar.model;

import racingcar.constant.Constant;
import racingcar.constant.ErrorMessage;
import racingcar.exception.CustomIllegalArgumentException;
import racingcar.utils.StringUtil;

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
            throw new CustomIllegalArgumentException(ErrorMessage.CAR_NAME_SPACE.getMessage());
        }
    }

    private void validateCarNameLength(String name) {
        if (name.length() > Constant.CAR_NAME_MAX_LENGTH || name.length() < Constant.CAR_NAME_MIN_LENGTH) {
            throw new CustomIllegalArgumentException(ErrorMessage.CAR_NAME_WRONG.getMessage());
        }
    }

    public void move(Integer randomNumber) {
        if (randomNumber >= Constant.MOVE_CRITERIA) {
            this.position++;
        }
    }

    public boolean isExists(String carName) {
        return this.name.equals(carName);
    }

    public boolean isMaxPosition(int max) {
        return this.position >= max;
    }

    public String getName() {
        return name;
    }

    public Integer getPosition() {
        return this.position;
    }
}
