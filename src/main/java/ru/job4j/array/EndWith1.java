package ru.job4j.array;

public class EndWith1 {
    public static boolean endWith(char[] word, char[] postfix) {
        boolean result = true;
        for (int i = 0; i < postfix.length; i++) {
            if (postfix[postfix.length - 1 - i] != word[word.length - 1 - i]) {
                return false;
            }
        }
        return result;
    }
}
