public class Game {
    protected Code code;

    public boolean isFinished;

    public Game() {
        this.code = new Code(CodeGenerator.generate());
    }

    public int[] guess(int[] pegs) {
        return code.guess(pegs);
    }
}
