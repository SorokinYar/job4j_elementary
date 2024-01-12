package ru.job4j.calculator;

public class PracticeOfMethods {
    public static int func1(int x, int y) {
        int q1 = x + y * x;
        return q1;
    }

    public static byte func2(byte x, byte y) {
        byte q2 = (byte) (x + y);  //Почему не работало без (byte) после =?
        return q2;
    }

    public static float func3(float x, float y) {
        float q3 = x / y + 1.8F;// Если  к y добавляю + 1.8 Почему просил заменить тип q3 c float на  double ?
        return q3;
    }

    public static double func4(double x, double y) {
        double q4 = x * y;
        return q4;
    }

    public static long func5(int x, int y, int z) {
        long q5 = x + y * z;
        return q5;
    }

    public static void main(String[] args) {
        int result1 = PracticeOfMethods.func1(34, 4);   //Тип возвращаемого метода int,  название PracticeOfMethods.func1, аргументы х,у
        System.out.println(result1);
        // Надо ли ставить пустые строчки между вызовами методов?
        byte result2 = PracticeOfMethods.func2((byte) 2, (byte) 5); //Почему просить добавить (byte) перед аргументами? Потому что byte указан в методе перед аргументами?
        System.out.println(result2);   //Тип возвращаемого метода byte,  название PracticeOfMethods.func2, аргументы х,у
        float result3 = PracticeOfMethods.func3(12.33F, 2.11F); //Почему без F ошибка?
        System.out.println(result3);   //Тип возвращаемого метода float,  название PracticeOfMethods.func3, аргументы х,у
        double result4 = PracticeOfMethods.func4(123.533, 77.278); //Почему здесь не нужна D?
        System.out.println(result4);   //Тип возвращаемого метода double,  название PracticeOfMethods.func4, аргументы х,у
        long result5 = PracticeOfMethods.func5(213444, 45, 1112);
        System.out.println(result5);   //Тип возвращаемого метода long,  название PracticeOfMethods.func5, аргументы х,у,z
    }


}
