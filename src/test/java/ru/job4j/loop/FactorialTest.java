package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void whenFactorialSix() {
        int num = 6;
        int result = Factorial.factorial(num);
        int expected = 720;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenFactorialZero() {
        int num = 0;
        int result = Factorial.factorial(num);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenFactorialNegative() {
        int num = -1;
        int result = Factorial.factorial(num);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }
}