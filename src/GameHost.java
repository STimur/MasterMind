import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameHost {
    private final Game game;
    private final BufferedReader bufferedReader;
    private String playerInput;

    public GameHost() {
        game = new Game();
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public static void main(String[] args) {
        new GameHost().start();
    }

    private void start() {
        while (!game.isFinished)
            interactWithPlayer();
        congratulatePlayer();
    }

    private void congratulatePlayer() {
        System.out.println("\nCongratulations! You broke the code.");
    }

    private void interactWithPlayer() {
        try {
            printGuessPromptMessage();
            readPlayerInput();
            validateInput();
            printGuessResult();
        } catch (InputValidator.ValidationException e) {
            System.out.println("Wrong input! You should type 4 integers, e.g.: 1122\n");
        } catch (IOException e) {
            System.out.println("Something wrong with IO subsystem! Contact sysadmin, if the problem persists.\n");
        }
    }

    private void printGuessPromptMessage() {
        System.out.println("Enter you guess:");
    }

    private void printGuessResult() {
        int[] answer = game.guess(InputParser.parse(playerInput));
        System.out.printf("wellplaced: %d misplaced: %d\n\n", answer[0], answer[1]);
    }

    private void readPlayerInput() throws IOException {
        playerInput = bufferedReader.readLine();
    }

    private void validateInput() {
        InputValidator.validate(playerInput);
    }
}
