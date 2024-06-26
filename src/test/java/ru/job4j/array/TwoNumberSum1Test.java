package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TwoNumberSum1Test {

    @Test

    void whenTwoEqualsNumbersNoTarget() {
        int[] array = {5, 5};
        int target = 12;
        int[] result = TwoNumberSum1.getIndex(array, target);
        int[] expected = { };
        assertThat(result).isEqualTo(expected);
    }

}