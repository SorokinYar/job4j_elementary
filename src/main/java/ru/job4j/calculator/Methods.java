package ru.job4j.calculator;

public class Methods {
    public static void plus(int first, int second) {
        int results = first + second;
        System.out.println(results);
    }

    public static void main(String[] args) {
        Methods.plus(100, 500);
        Methods.plus(2, 3);
        Methods.plus(5, 3);
    }
}


