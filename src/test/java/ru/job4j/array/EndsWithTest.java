package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class EndsWithTest {

    @Test
    void whenPrefixInWordCorrect() {
        char[] word = {'A', 'r', 'r', 'a', 'y'};
        char[] prefix = {'a', 'y'};
        boolean result = EndsWith.endsWith(word,prefix);
        assertThat(result).isTrue();
    }

    @Test
    void whenPrefixInWordNotCorrect() {
        char[] word = {'H', 'i'};
        char[] prefix = {'y'};
        boolean result = EndsWith.endsWith(word, prefix);
        assertThat(result).isFalse();
    }

}