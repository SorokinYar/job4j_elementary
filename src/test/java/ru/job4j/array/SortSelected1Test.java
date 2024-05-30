package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class SortSelected1Test {

    @Test

    void testSort() {
        int[] array = {3, 2, 5, 1, 4};
        int[] expected = {1, 2, 3, 4, 5};
        int[] result =SortSelected1.sort(array);
        assertThat(result).containsExactly(expected);
    }

}