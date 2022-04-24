package racingcar;

public class RacingGame {
    private int gameCount;
    public RacingGame(String gameCountInput) {
        gameCount = Integer.parseInt(gameCountInput);
    }

    public int getGameCount() {
        return gameCount;
    }
}
