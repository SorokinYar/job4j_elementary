package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        float dollar = rubleToDollar(540);
        System.out.println("560 rubles are " + dollar + " dollars");

        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("140 rubles are 2. Test result : " + passed);

        input = 540;
        expected = 9;
        output = rubleToDollar(input);
        passed = expected == output;
        System.out.println("540 rubles are 9. Test result : " + passed);
    }
}
