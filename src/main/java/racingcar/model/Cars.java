package racingcar.model;

import racingcar.constant.Constant;
import racingcar.constant.ErrorMessage;
import racingcar.exception.CustomIllegalArgumentException;
import racingcar.utils.ConsoleUtil;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> cars = new ArrayList<>();

    public Cars(String carsName) {
        String[] splitCarNames = splitCarsName(carsName);
        validateCarName(splitCarNames);
        for(String carName : splitCarNames) {
            cars.add(new Car(carName, 0));
        }
    }

    private String[] splitCarsName(String carsName) {
        return carsName.split(Constant.COMMA);
    }

    private void validateCarName(String[] splitCarName) {
        for (String carName : splitCarName) {
            if (isDuplicateCarName(carName)) {
                throw new CustomIllegalArgumentException(ErrorMessage.CAR_NAME_DUPLICATE.getMessage());
            }
        }
    }

    private boolean isDuplicateCarName(String carName) {
        for (Car car : cars) {
            if(car.isExists(carName)) {
                return true;
            }
        }
        return false;
    }

    public void move() {
        cars.forEach(car ->
                car.move(RandomNumber.getRandomNumber())
        );
    }

    public List<Car> getCars() {
        return cars;
    }
}
