import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CodeShould {
    @Test
    public void
    calculate_well_placed_and_misplaced_pegs() {
        assertThat(new Code(new int[]{0, 0, 0, 0}).guess(new int[]{1, 1, 1, 1}), is(new int[]{0, 0}));
        assertThat(new Code(new int[]{0, 0, 0, 0}).guess(new int[]{0, 1, 1, 1}), is(new int[]{1, 0}));
        assertThat(new Code(new int[]{0, 0, 0, 0}).guess(new int[]{0, 0, 0, 0}), is(new int[]{4, 0}));
    }
}
