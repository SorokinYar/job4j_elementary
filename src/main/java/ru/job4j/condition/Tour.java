package ru.job4j.condition;

public class Tour {

    public static void offer(boolean pasport) {
        System.out.println("A client has a foreign pasport" + pasport);
        if (pasport) { // Если ставить знак отрицвния ! то все наоборот.
            System.out.println("Tours abroad.");
        } else {
            System.out.println("Tours in Russia.");
        }
    }
    public  static void main(String[] args) {
        Tour.offer(true);
        offer(false);
    }
}
