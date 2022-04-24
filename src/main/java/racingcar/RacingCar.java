package racingcar;


import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class RacingCar {
    private String racingCarName;
    private int forwardCount;
    public RacingCar(String racingGameNameInput) {
        this.racingCarName = racingGameNameInput;
    }

    public void race() {
        if(pickNumberInRange(0, 9) >=4){
            forwardCount++;
        };
    }

    public String getRacingCarName() {
        return racingCarName;
    }

    public int getForwardCount() {
        return forwardCount;
    }
}
