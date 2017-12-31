import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GameShould {
    @Test
    public void
    not_be_finished_after_creation() {
        assertThat(new Game().isFinished, is(false));
    }
}
