package racingcar;

import java.util.HashMap;

public class RacingGame {
    private int gameCount;
    private HashMap<String,RacingCar> racingCar;
    public RacingGame(String racingCarNameInput,String gameCountInput) {
        racingCar = new HashMap<>();
        gameCount = Integer.parseInt(gameCountInput);
        String[] racingCarNames = racingCarNameInput.split(",");
        for(String racingCarName : racingCarNames){
            racingCar.put(racingCarName,new RacingCar(racingCarName));
        }
    }

    public int getGameCount() {
        return gameCount;
    }

    public HashMap<String, RacingCar> getRacingCar() {
        return racingCar;
    }
}
