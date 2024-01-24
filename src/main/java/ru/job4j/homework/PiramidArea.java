package ru.job4j.homework;

public class PiramidArea {
    public static double area(int a, int b, int ha, int hb) {
        double areaBase = areaBaseMethods(a,b);
        double areaTriangleA = areaTriangleAMethods(a, ha);
        double areaTriangleB = areaTriangleBMethods(b, hb);
        double piramidAreaResult = areaBase + (2 * areaTriangleA) + (2 * areaTriangleB);
        return piramidAreaResult;
    }

    public static double areaBaseMethods(int a, int b){
        double result = a * b;
        return result;

    }

    public static double areaTriangleAMethods(int a, int ha){
        double result = 1.0 / 2.0 * a * ha;
        return result;
    }

    public static double areaTriangleBMethods(int b, int hb){
       double result = 1.0 / 2.0 * b * hb;
        return result;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int ha = 4;
        int hb = 6;
        double result = area(a,b, ha, hb);
        System.out.println(" The area of the piramid with sides " + a + " and " + b + " and apophemes " + ha + " and " + hb + " equal " + result);
    }
}
