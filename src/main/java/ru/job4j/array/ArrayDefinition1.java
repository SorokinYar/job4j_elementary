package ru.job4j.array;

import com.sun.jdi.PathSearchingVirtualMachine;

public class ArrayDefinition1 {
    public static void method() {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2 + 3;
        }
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        method();
    }

}

