import org.junit.Test;

import java.io.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PlayGameFeature {
    @Test
    public void
    play_game() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        GameHost gameHost = new GameHostMock();
        gameHost.start();
        assertThat(outputStream.toString(),
                is("Enter you guess:\n" +
                        "wellplaced: 0 misplaced: 1\n" +
                        "\n" +
                        "Enter you guess:\n" +
                        "wellplaced: 1 misplaced: 1\n" +
                        "\n" +
                        "Enter you guess:\n" +
                        "wellplaced: 0 misplaced: 2\n" +
                        "\n" +
                        "Enter you guess:\n" +
                        "wellplaced: 2 misplaced: 0\n" +
                        "\n" +
                        "Enter you guess:\n" +
                        "wellplaced: 2 misplaced: 0\n" +
                        "\n" +
                        "Enter you guess:\n" +
                        "wellplaced: 3 misplaced: 0\n" +
                        "\n" +
                        "Enter you guess:\n" +
                        "wellplaced: 2 misplaced: 2\n" +
                        "\n" +
                        "Enter you guess:\n" +
                        "wellplaced: 4 misplaced: 0\n" +
                        "\n" +
                        "\n" +
                        "Congratulations! You broke the code.\n"));
    }

    private class GameHostMock extends GameHost {
        public GameHostMock() {
            game = new GameMock(new int[]{2, 3, 5, 0});
            InputStream inputStream = new ByteArrayInputStream((
                    "1122\n" +
                            "3322\n" +
                            "3232\n" +
                            "2332\n" +
                            "2344\n" +
                            "2355\n" +
                            "2305\n" +
                            "2350\n").getBytes());
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        }
    }
}
