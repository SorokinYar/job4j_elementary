package ru.job4j.loop;

public class Slash {
    public static void draw(int size) {
        for (int i = 0; i < size; i++) {
            for (int k = 0; k < size; k++) {
                if (i == k) {
                    System.out.print("0");
                }
                if (i + k == size - 1) {
                    System.out.print("0");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        draw(3);
    }
}
