package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RacingCarTest {

    @Test
    @DisplayName("각 자동자 0-9 사이의 random 값 부여")
    void racingCarRanDomNumberTest(){
        RacingCar racingCar = new RacingCar("1");
    }
}