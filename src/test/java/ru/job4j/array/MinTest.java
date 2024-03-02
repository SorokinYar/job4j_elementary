package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MinTest {

    @Test
    void whenMinFirst() {
        int[] array = {1, 2, 3};
        int result = Min.findMin(array);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMiddleMin() {
        int[] array = {2, 1, 3};
        int result = Min.findMin(array);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenLastMin() {
        int[] array = {2, 3, 1};
        int result = Min.findMin(array);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }



}