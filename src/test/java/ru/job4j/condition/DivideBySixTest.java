package ru.job4j.condition;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class DivideBySixTest {

    @Test
    void whenDivideSix() {
        int input = 12;
        String result = DivideBySix.checkNumber(input);
        String expected = "The number divides by 6.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenDivideThreeAndNotEven() {
        int input = 15;
        String result = DivideBySix.checkNumber(input);
        String expected = "The number divides by 3, but it isn't the even number.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNotDivideThreeAndEven() {
        int input = 8;
        String result = DivideBySix.checkNumber(input);
        String expected = "The number doesn't divide by 3, but it is the even number.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNotDivideThreeAndNotEven() {
        int input = 7;
        String result = DivideBySix.checkNumber(input);
        String expected = "The number doesn't divide by 3 and it isn't the even number.";
        assertThat(result).isEqualTo(expected);
    }
}