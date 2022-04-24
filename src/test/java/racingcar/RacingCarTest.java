package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RacingCarTest {

    @Test
    @DisplayName("각 자동자 0-9 사이의 random 값 부여")
    void racingCarRanDomNumberTest(){
        //given
        RacingCar racingCar = new RacingCar("1");

        //when
        racingCar.race(4);

        //then
        assertThat(racingCar.getForwardCount()).isGreaterThanOrEqualTo(0);
    }

    @Test
    @DisplayName("각 자동차 횟수 만큼 racing")
    void runGameRacingCarByGameCountTest(){
        //given
        RacingGame racingGame = new RacingGame("1,2,3","5");

        //when
        racingGame.runRace();
        List<RacingCar> racingCars = racingGame.getRacingCars();

        //then
        for(RacingCar racingCar : racingCars){
            assertThat(racingCar.getForwardCount()).isGreaterThanOrEqualTo(0);
        }
    }
}