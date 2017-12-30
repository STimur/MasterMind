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

    public int[] guess(int firstPegGuess, int secondPegGuess, int thirdPegGuess, int fourthPegGuess) {
        int wellPlaced = 0;
        if (this.firstPeg == firstPegGuess)
            wellPlaced++;
        if (this.secondPeg == secondPegGuess)
            wellPlaced++;
        if (this.thirdPeg == thirdPegGuess)
            wellPlaced++;
        if (this.fourthPeg == fourthPegGuess)
            wellPlaced++;
        return new int[]{wellPlaced, 0};
    }
}
