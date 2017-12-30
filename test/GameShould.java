import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GameShould {
    @Test
    public void
    calculate_well_placed_and_misplaced_pegs() {
        assertThat(new Game(0, 0, 0, 0).guess(1, 1, 1, 1), is(new int[]{0, 0}));
        assertThat(new Game(0, 0, 0, 0).guess(0, 1, 1, 1), is(new int[]{1, 0}));
    }
}
