package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SwitchArrayTest {

    @Test
    void whenArrayHaveLengthAt6() {
        int[] input = new int[] {1, 4, 4, 9, 4, 8};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = new int[] {8, 4, 4, 9, 4, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenArrayHaveLendthAt3() {
        int[] input = new int[] {1, 2, 3, 4};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = new int[] {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenArrayHaveLengthAt2() {
        int[] input = new int[] {5, 6, 8};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = new int[] {8, 6, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void switchElementWhenSource2AndDestination4() {
        int[] input = new int[] {1, 2, 3, 4, 5};
        int source = 2;
        int destination = 4;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = new int[] {1, 2, 5, 4, 3};
        assertThat(result).containsExactly(expected);
    }

}