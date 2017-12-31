public class Code {
    private final int[] pegs;

    public Code(int[] pegs) {
        this.pegs = pegs;
    }

    public int[] guess(int[] pegs) {
        int wellPlaced = 0;
        int misplaced = 0;
        for (int i = 0; i < pegs.length; i++) {
            if (this.pegs[i] == pegs[i])
                wellPlaced++;
            else if (checkOtherPositionsFor(pegs[i], i))
                misplaced++;
        }
        return new int[]{wellPlaced, misplaced};
    }

    private boolean checkOtherPositionsFor(int peg, int i) {
        for (int j = 0; j < pegs.length; j++) {
            if (j == i)
                continue;
            if (peg == pegs[j])
                return true;
        }
        return false;
    }
}
