package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class EqualLast1Test {

    @Test
    void whenLastElementEqual() {
        int[] left = {1, 2, 3};
        int[] right = {3, 4, 3};
        boolean result = EqualLast1.check(left, right);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotEqual() {
        int[] left = {1, 2, 3};
        int[] right = {3, 3, 4};
        boolean result = EqualLast1.check(left, right);
        assertThat(result).isFalse();
    }

}