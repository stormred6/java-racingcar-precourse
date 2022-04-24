package racingcar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RacingGame {
    private int gameCount;
    private List<RacingCar> racingCars;
    public RacingGame(String racingCarNameInput,String gameCountInput) {
        racingCars = new ArrayList<>();
        gameCount = Integer.parseInt(gameCountInput);
        String[] racingCarNames = racingCarNameInput.split(",");
        for(String racingCarName : racingCarNames){
            racingCars.add(new RacingCar(racingCarName));
        }
    }

    public int getGameCount() {
        return gameCount;
    }

    public List<RacingCar> getRacingCars() {
        return racingCars;
    }

    public void runRace() {
         for(RacingCar racingCar : this.racingCars){
             racingCar.race(this.gameCount);
         }
    }
}
