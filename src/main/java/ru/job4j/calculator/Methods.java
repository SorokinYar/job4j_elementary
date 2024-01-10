package ru.job4j.calculator;

public class Methods {
    public static int plus(int first, int second) {
        int results = first + second;
        return results;
    }

    public static void main(String[] args) {
        int x = Methods.plus(12, 2);
        System.out.println(x);
    }
}


