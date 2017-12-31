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
            else if (pegs[i] == this.pegs[0] || pegs[i] == this.pegs[1] || pegs[i] == this.pegs[2])
                misplaced++;
        }
        return new int[]{wellPlaced, misplaced};
    }
}
