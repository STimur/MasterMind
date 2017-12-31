import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GameShould {
    private int[] intArray(int... ints) {
        return ints;
    }

    private class GameMock extends Game {
        public GameMock() {
            code = new Code(intArray(1, 2, 3, 4));
        }
    }

    @Test
    public void
    not_be_finished_after_creation() {
        assertThat(new Game().isFinished, is(false));
    }

    @Test
    public void
    on_guess_return_number_of_wellplaced_and_misplaced_pegs() {
        assertThat(new GameMock().guess(intArray(0, 0, 0, 0)), is(intArray(0, 0)));
        assertThat(new GameMock().guess(intArray(1, 3, 2, 4)), is(intArray(2, 2)));
    }
}
