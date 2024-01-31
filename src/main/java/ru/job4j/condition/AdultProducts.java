package ru.job4j.condition;

public class AdultProducts {
    public static void accessToOrder(int age) {
        System.out.println("If the age of the customer: " + age);
        if (age >= 21) {
            System.out.println("Have a nice shopping");
        } else {
            System.out.println("The customers access to the order is closed");
        }
    }
    public static void main(String[] args) { // Буз стринг и аргс не возможно запустить почему?
        accessToOrder(16);
        accessToOrder(21);
        accessToOrder(25);
    }
}