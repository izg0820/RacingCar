package racingcar.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ResultTest {

    @Test
    void 우승자찾기() {
        Cars cars = new Cars("c,b");
        Repeat repeatTime = new Repeat("2");
        while (!repeatTime.isEnd()) {
            cars.getCars().get(0).move(4);
            cars.getCars().get(1).move(3);
            repeatTime.reduce();
        }
        PlayResult result = new PlayResult(cars);
        assertThat(result.getWinners()).isEqualTo("c");
    }
}
