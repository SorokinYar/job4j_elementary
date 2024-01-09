package ru.job4j.calculator;

public class Calculator {
    public static void main(String[] args) {
        int first = 1;
        int second = 3;
        int result = first + second;
        System.out.println(result);

        int six = 6;
        int four = 4;
        int five = 5;
        int two = 2;

        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;

        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);

        int size = 10;
        System.out.println(size);
        size = 100;
        System.out.println(size);
        size = size - 5;
        System.out.println(size);
        size = size / 15;
        System.out.println(size);
    }
}
