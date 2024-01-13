package ru.job4j.homework;

public class CreationNewMethods {

    public static double celsiusToKelvin(double value) {
        double result = value - 273.15;
        return result;
    }

    public static int vacationPay(int salary, int numberOfVacationDays) { //Параметры или аргументы как правильно записывать?
        double result = (salary / 29.3) * numberOfVacationDays;
        return (int) result; //Почему ставить int  или double в типе метода?
    }

    public static float fuelRate(float volumeOfSpentFuel, float distanceTraveled) {
        float result = (volumeOfSpentFuel / distanceTraveled) * 100;
        return result;
    }

    public static void main(String[] args) {
        double value = 328; //Как-то сложно написанно,сначала нужно вызвать метод , ротом задавать аргументы? пример Fit
        double celsius = CreationNewMethods.celsiusToKelvin(value);
        System.out.println(value + " degrees Kelvin equal to " + celsius + " Celsius. ");
        value = 533;
        celsius = celsiusToKelvin(value);
        System.out.println(value + " degrees Kelvin equal to " + celsius + " Celsius. "); //Если не стаивть пробел между + и  celsius это не красиво?

        int amountVacationPay = CreationNewMethods.vacationPay(158056, 24);
        System.out.println("Your vacation allowance is " + amountVacationPay);
        amountVacationPay = vacationPay(343000, 17);
        System.out.println("Your vacation allowance is " + amountVacationPay);

        float fuelRate = fuelRate(23.3F, 122.1F);
        System.out.println("Fuel rate on " + 122.1 + " km " + "= " + fuelRate + "L/km");
        fuelRate = fuelRate(8.02F, 108.343F);
        System.out.println( "Fuel rate on " + 108.343 + " km " + "= " + fuelRate + "L/km");

    }
}
