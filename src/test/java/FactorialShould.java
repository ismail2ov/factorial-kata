import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialShould {

    private Factorial factorial;

    @BeforeEach
    void setUp() {
        factorial = new Factorial();
    }

    @Test
    void return_1_for_factorial_of_0() {
        long actual = factorial.of(0);

        assertEquals(1, actual);
    }

    @Test
    void return_1_for_factorial_of_1() {
        long actual = factorial.of(1);

        assertEquals(1, actual);
    }

    @Test
    void return_2_for_factorial_of_2() {
        long actual = factorial.of(2);

        assertEquals(2, actual);
    }

    @Test
    void return_6_for_factorial_of_3() {
        long actual = factorial.of(3);

        assertEquals(6, actual);
    }
}
