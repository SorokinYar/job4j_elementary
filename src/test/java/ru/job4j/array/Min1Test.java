package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class Min1Test {

    @Test

    void whenMin3() {
        int[] array = {3, 4, 6};
        int expected = 3;
        int result = Min1.findMin(array);
        assertThat(result).isEqualTo(expected);
    }

    @Test

    void whenMin0() {
        int[] array = {5, 6, 7, 0};
        int expected = 0;
        int result = Min1.findMin(array);
        assertThat(result).isEqualTo(expected);
    }
}