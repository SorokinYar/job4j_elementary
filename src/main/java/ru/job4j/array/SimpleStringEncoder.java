package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        StringBuilder result = new StringBuilder();
        int left = 0;
        int right = 0;
        int counter = 0;
        while (right < input.length()) {
            if ( input.charAt(right) != input.charAt(left)) {
                result.append(input.charAt(left)).append(counter);
                counter = 0;
                left = right;
            }
            counter++;
            right++;
        }
        result.append(input.charAt(input.length() - 1));
        return result.toString();

    }

    public static void main(String[] args) {
        String input = "aaabbc";
        System.out.println(encode(input));
    }
}
