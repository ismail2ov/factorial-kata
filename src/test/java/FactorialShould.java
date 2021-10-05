import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialShould {

    @Test
    void return_1_for_factorial_of_0() {
        Factorial factorial = new Factorial();

        int actual = factorial.of(0);

        assertEquals(1, actual);
    }

    @Test
    void return_1_for_factorial_of_1() {
        Factorial factorial = new Factorial();

        int actual = factorial.of(1);

        assertEquals(1, actual);
    }

    @Test
    void return_2_for_factorial_of_2() {
        Factorial factorial = new Factorial();

        int actual = factorial.of(2);

        assertEquals(2, actual);
    }
}
