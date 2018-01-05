import org.junit.Test;

public class InputValidatorShould {
    @Test(expected = InputValidator.ValidationException.class)
    public void
    throw_exception_when_input_length_more_than_four() {
        InputValidator.validate("12345");
    }
}
