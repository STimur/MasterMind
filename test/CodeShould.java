import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CodeShould {
    private int[] intArray(int... ints) {
        return ints;
    }

    @Test
    public void
    calculate_wellplaced_pegs() {
        assertThat(new Code(intArray(0, 0, 0, 0)).guess(intArray(1, 1, 1, 1)), is(new int[]{0, 0}));
        assertThat(new Code(intArray(0, 0, 0, 0)).guess(intArray(0, 1, 1, 1)), is(new int[]{1, 0}));
        assertThat(new Code(intArray(0, 0, 0, 0)).guess(intArray(0, 0, 0, 0)), is(new int[]{4, 0}));
    }


}
