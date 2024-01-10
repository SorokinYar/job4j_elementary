package ru.job4j.calculator;

public class ArgumentsMethod {

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", age = " + age);
    }

    public static void main(String[] args) {
        String name = "Job4j";
        int age = 6;
        ArgumentsMethod.hello(name, age);
        ArgumentsMethod.hello(name, age);
        ArgumentsMethod.hello(name, age);
        ArgumentsMethod.hello(name, age);
        int resultMultiple = ArgumentsMethod.multiple(3, 8, 6);
        System.out.println(resultMultiple);
        double resultDivide = ArgumentsMethod.divide(7, 5);
        System.out.println(resultDivide);
    }

    public static int multiple(int x, int y, int z) {
        int result = x * y * z;
        return result;
    }

    public static double divide(int z, int x) {
        double resultDivide = (double) z / x;
        return resultDivide;
    }
}
