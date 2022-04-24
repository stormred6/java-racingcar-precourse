package racingcar;


public class RacingCar {
    private String[] racingGameCars;
    public RacingCar(String racingGameNameInput) {
        racingGameCars = racingGameNameInput.split(",");
    }

    public String[] getRacingGameCars() {
        return racingGameCars;
    }
}
