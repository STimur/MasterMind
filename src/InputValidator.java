public class InputValidator {
    public static void validate(String input) {
        if (input.length() != 4)
            throw new ValidationException();

    }

    public static class ValidationException extends RuntimeException {
    }
}
