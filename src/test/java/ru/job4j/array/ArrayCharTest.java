package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ArrayCharTest {

    @Test
    void whenWordWithPrefixTrue() {
        char[] word = {'P', 'o', 'k', 'a' };
        char[] prefix = {'P', 'o'};
        boolean result = ArrayChar.startaWitn(word,prefix);
        assertThat(result).isTrue();
    }

    @Test
    void whenWordWithPrefixFalse() {
        char[] word = {'P', 'o', 'k', 'a'};
        char[] prefix = {'P', 'a'};
        boolean result = ArrayChar.startaWitn(word, prefix);
        assertThat(result).isFalse();
    }

}