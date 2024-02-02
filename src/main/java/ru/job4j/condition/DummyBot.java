package ru.job4j.condition;

public class DummyBot {

    public static String answer(String question) {
        String result = "I don't know. Please, ask another question.";
        if ("Hi, Bot.".equals(question)) {
            result = "Hi, smartAss!";
        } else if ("Bye Bot.".equals(question)) {
            result = "See you later!";
        } else if ("How are you?".equals(question)) {
            result = "I`m zaebis!";
        }
        return result;
    }

    public static void main(String[] args) {
        String result = answer("Hi, Bot.");
        System.out.println(result);

        result = answer("Bye Bot.");
        System.out.println(result);
    }
}
