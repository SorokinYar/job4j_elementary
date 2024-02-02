package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DummyBotTest {

    @Test
    void whenGreetBot() {
        String input = "Hi, Bot.";
        String result = DummyBot.answer(input);
        String expected = "Hi, smartAss!";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenByeBot() {
        String input = "Bye Bot.";
        String result = DummyBot.answer(input);
        String expected = "See you later!";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenHowAreYou() {
        String input = "How are you?";
        String result = DummyBot.answer(input);
        String expected = "I`m zaebis!";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenUnknownBot() {
        String input = "How much?";
        String result = DummyBot.answer(input);
        String expected = "I don't know. Please, ask another question.";
        assertThat(result).isEqualTo(expected);
    }
}