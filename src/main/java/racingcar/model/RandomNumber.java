package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.constant.Constant;

public class RandomNumber {

    private static int randomNumber;

    public static Integer getRandomNumber() {
        randomNumber = Randoms.pickNumberInRange(Constant.RANDOM_MIN, Constant.RANDOM_MAX);
        return randomNumber;
    }

}
