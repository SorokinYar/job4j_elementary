package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;


class ArrayChar1Test {

    @Test
    void whenWordStartWithPrefTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = ArrayChar1.startWith(word, pref);
        assertThat(result).isTrue();
    }

    @Test
void whenWordStartWithTrueFalse() {
    char[] word = {'H', 'e', 'l', 'l', 'o'};
    char[] pref = {'H', 'i'};
    boolean result = ArrayChar1.startWith(word, pref);
    assertThat(result).isFalse();
    }
}