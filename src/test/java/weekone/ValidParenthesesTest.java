package weekone;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    ValidParentheses validParentheses = new ValidParentheses();

    @Test
    void isValidExample1() {
        assertThat(validParentheses.isValid("()"), is(true));
    }

    @Test
    void isValidExample2() {
        assertThat(validParentheses.isValid("()[]{}"), is(true));
    }

    @Test
    void isValidExample3() {
        assertThat(validParentheses.isValid("(]"), is(false));
    }

}
