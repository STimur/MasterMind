public class Code {
    private final int[] pegs;

    public Code(int[] pegs) {
        this.pegs = pegs;
    }

    public int[] guess(int[] pegs) {
        int wellPlaced = 0;
        for (int i = 0; i < pegs.length; i++)
            if (this.pegs[i] == pegs[i])
                wellPlaced++;
        return new int[]{wellPlaced, 0};
    }
}
