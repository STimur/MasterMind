public class Game {
    private final int firstPeg;
    private final int secondPeg;
    private final int thirdPeg;
    private final int fourthPeg;

    public Game(int firstPeg, int secondPeg, int thirdPeg, int fourthPeg) {
        this.firstPeg = firstPeg;
        this.secondPeg = secondPeg;
        this.thirdPeg = thirdPeg;
        this.fourthPeg = fourthPeg;
    }

    public int[] guess(int firstPeg, int secondPeg, int thirdPeg, int fourthPeg) {
        return new int[]{0, 0};
    }
}
