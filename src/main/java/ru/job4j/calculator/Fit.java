package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double result = (height - 100) * 1.15;
        return result;
    }

    public static double womanWeight(short height) {
        double result = (height - 110) * 1.15;
        return result;
    }

    public static void main(String[] args) {
        short height = 176;
        double man = Fit.manWeight(height);
        System.out.println("Mashina 176 is " + man);

        height = 178;
        man = manWeight(height);
        System.out.println("Mashina2 178 is " + man);

        height = 160;
        double woman = womanWeight(height);
        System.out.println(woman);
    }

}
