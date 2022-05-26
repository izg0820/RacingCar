package racingcar.model;


import racingcar.constant.ErrorMessage;
import racingcar.exception.CustomIllegalStateException;

import java.util.ArrayList;
import java.util.List;

public class PlayResult {
    List<Car> cars = new ArrayList<>();

    public PlayResult(Cars cars) {
        this.cars = cars.getCars();
    }

    public String getWinners() {
        List<String> winners = new ArrayList<>();
        int max = findMaxPosition();
        cars.forEach(car -> {
            if (car.isMaxPosition(max)) {
                winners.add(car.getName());
            }
        });
        return String.join(",", winners);
    }

    private int findMaxPosition() {
        isExist();
        int max = this.cars.get(0).getPosition();
        for (Car car : cars) {
            if (car.isMaxPosition(max)) {
                max = car.getPosition();
            }
        }
        return max;
    }

    private void isExist() {
        if(this.cars.size() == 0) {
            throw new CustomIllegalStateException(ErrorMessage.RACING_CAR_NOT_EXISTING.getMessage());
        }
    }

}
