package ru.job4j.array;

public class EndsWith {

    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;
        for (int index = postfix.length -1; index >= 0; index--) {
            if (postfix[postfix.length - 1 - index] != word[word.length - 1 - index]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] word = new char[] {'H', 'i'};
        char[] prefix = new char[] {'i'};
        System.out.println(endsWith(word,prefix));
    }
}
