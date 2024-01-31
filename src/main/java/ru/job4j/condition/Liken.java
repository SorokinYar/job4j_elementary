package ru.job4j.condition;

public class Liken {
    public static void main (String[] args) { //Почему стринг , квадратные скобки и что такое args&
        int first = 10;
        int second = 9;

        boolean result = first > second; //Почему горит желтым?
        System.out.println(result);

        result = first < second; //Не ставлю тип переменной так это значит что я назначаю новую переменную, а я уже ее обьявил на 8 строке?
        System.out.println(result);

        result = first == second;
        System.out.println(result);

        result = first >= second;
        System.out.println(result);

        result = first <= second;
        System.out.println(result);

        result = first != second;
        System.out.println(result);
    }
}
