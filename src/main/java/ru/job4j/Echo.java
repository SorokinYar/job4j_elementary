package ru.job4j;

public class Echo {
    public static void main(String[] args) {
        System.out.println("Privet");
        sum(12,4);
    }

    public static void sum(int a, int b) {
        int sum = a+b;
        System.out.println(sum);
    }
}
