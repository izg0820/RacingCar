package racingcar.model;

import racingcar.model.Car;
import racingcar.utils.StringUtil;

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
        int max = this.cars.get(0).getPosition();
        for (Car car : cars) {
            if (car.isMaxPosition(max)) {
                max = car.getPosition();
            }
        }
        return max;
    }

}
