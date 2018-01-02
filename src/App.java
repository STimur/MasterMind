import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        Game game = new Game();
        System.out.println("Enter you guess:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (!game.isFinished) {
            try {
                String str = br.readLine();
                if (str.length() > 4)
                    throw new NumberFormatException();
                int[] pegsGuess = new int[]{
                        Integer.valueOf(Integer.valueOf(str.substring(0, 1))),
                        Integer.valueOf(Integer.valueOf(str.substring(1, 2))),
                        Integer.valueOf(Integer.valueOf(str.substring(2, 3))),
                        Integer.valueOf(Integer.valueOf(str.substring(3, 4)))
                };
                int[] answer = game.guess(pegsGuess);
                System.out.printf("wellplaced: %d misplaced: %d\n", answer[0], answer[1]);
            } catch (NumberFormatException e) {
                System.out.println("Wrong input! You should type 4 integers, e.g.: 1122");
            } catch (IOException e) {
                System.out.println("Something wrong with IO subsystem! Contact sysadmin, if the problem persists.");
            }
        }
        System.out.println("\nCongratulations! You broke the code.");
    }
}
