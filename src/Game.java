public class Game {
    protected Code code;

    public boolean isFinished;

    public Game() {
        this.code = new Code(CodeGenerator.generate());
    }

    public int[] guess(int[] pegs) {
        int[] answer = code.guess(pegs);
        if (answer[0] == 4)
            isFinished = true;
        return answer;
    }
}
