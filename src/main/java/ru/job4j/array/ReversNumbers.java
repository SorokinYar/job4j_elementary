package ru.job4j.array;

public class ReversNumbers {

    public static void main(String[] args) {
        int[] sequence = {1, 2, 3, 4, 5};
        for (int index = sequence.length - 1; index >= 0; index--) {
            System.out.println(sequence[index]);
        }
    }
}
