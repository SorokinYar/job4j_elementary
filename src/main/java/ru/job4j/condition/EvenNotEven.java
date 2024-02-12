package ru.job4j.condition;

public class EvenNotEven {

    public static void number(int num) {
        int p;
        String da;
        switch (num) {
            case 100 -> System.out.println("Kakashka");
            case 110, 120 -> System.out.println("I learn programming.");
            case 130 -> {
                da = "Jopa.";
                System.out.println(da);
            }
            case 150 ->{
                p = 100;
                System.out.println(p - 200);
            }
            default -> System.out.println("Pisulka");
        }
    }

    public static void main(String[] args) {
        number(100);
        number(110);
        number(150);
        number(130);
        number(400);
    }

}
