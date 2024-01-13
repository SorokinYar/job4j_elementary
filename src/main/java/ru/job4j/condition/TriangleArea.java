package ru.job4j.condition;

public class TriangleArea {
    public static double area(double a, double b, double c) {
        double p = halfPerimeter(a, b, c);
        double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return result;
    }

    public static double halfPerimeter(double a, double b, double c) {
        double result = (a + b + c) / 2;
        return result;
    }

    public static void main(String[] args) {
        double result = TriangleArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + result);
    }
}
