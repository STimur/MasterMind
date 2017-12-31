import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GameShould {
    @Test
    public void
    not_be_finished_after_creation() {
        assertThat(new Game().isFinished, is(false));
    }

    @Test
    public void
    on_guess_return_number_of_wellplaced_and_misplaced_pegs() {
        assertThat(new Game().guess(intArray(0, 0, 0, 0)), is(intArray(0, 0)));
    }

    private int[] intArray(int... ints) {
        return ints;
    }
}
