package ru.job4j.condition;

public class RectangleArea {
    public static double square(double p, double k) {
        double result = length(p, k) * height(p, k);
        return result;
    }

    public static double height(double p, double k) {
        double result = p / (2 * (k +1));
        return result;
    }

    public static double length(double p, double k) {
        double result = height(p, k) * k;
        return result;
    }


    public static void main(String[] args) {
        double result = square(6, 2);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result);

        result = square(28,4);
        System.out.println(result);
    }
}
