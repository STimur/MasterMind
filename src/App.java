import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        Game game = new Game();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (!game.isFinished) {
            String str = readLine(br);
            int[] pegsGuess = new int[]{
                    Integer.valueOf(Integer.valueOf(str.substring(0, 1))),
                    Integer.valueOf(Integer.valueOf(str.substring(1, 2))),
                    Integer.valueOf(Integer.valueOf(str.substring(2, 3))),
                    Integer.valueOf(Integer.valueOf(str.substring(3, 4)))
            };
            int[] answer = game.guess(pegsGuess);
            System.out.printf("wellplaced: %d misplaced: %d\n", answer[0], answer[1]);
        }
    }

    private static String readLine(BufferedReader br) {
        try {
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
