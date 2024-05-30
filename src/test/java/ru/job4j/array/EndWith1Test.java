package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class EndWith1Test {

    @Test
    public void whenWordEndPostfixTrue() {
        char[] postfix = {'i'};
        char[] word = {'H', 'i'};
        boolean result = EndWith1.endWith(word, postfix);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotEndWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] postfix = {'l', 'a'};
        boolean result = EndWith1.endWith(word, postfix);
        assertThat(result).isFalse();

    }
}