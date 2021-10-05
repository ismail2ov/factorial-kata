import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialShould {

    private Factorial factorial;

    public static Stream<Arguments> provideNumbersForFactorial() {
        return Stream.of(
                Arguments.of(0, 1),
                Arguments.of(1, 1),
                Arguments.of(2, 2),
                Arguments.of(3, 6),
                Arguments.of(4, 24)
        );
    }

    @BeforeEach
    void setUp() {
        factorial = new Factorial();
    }

    @ParameterizedTest
    @MethodSource("provideNumbersForFactorial")
    void return_expected_for_factorial_of_input(long input, long expected) {
        long actual = factorial.of(input);

        assertEquals(expected, actual);
    }

}
