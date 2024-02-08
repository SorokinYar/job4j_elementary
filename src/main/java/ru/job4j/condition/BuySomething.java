package ru.job4j.condition;

public class BuySomething {
    public static void decision(boolean haveMoney, boolean itIsNecessary) {
        if (haveMoney && itIsNecessary) {
            System.out.println("I buy it.");
        } else {
            System.out.println("I don`t need it.");
        }
    }

    public static void main(String[] args) {
        decision(true,false);
        decision(true,true);
    }
}
