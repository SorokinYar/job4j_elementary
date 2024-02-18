package ru.job4j.homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FindByIndexTest {

    @Test
    void whenIndex3ThenResult8 () {
        int index = 3;
        int[] data = new int[] {4, 6, 3, 8, 1};
        int result = FindByIndex.findElementByIndex(data, index);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

}