package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String dayOfWeek;
        switch (day){
            case 1 :
                dayOfWeek = "Monday.";
                break;
            case 2 :
                dayOfWeek = "Thusday.";
                break;
            case 3 :
                dayOfWeek = "Wednesday.";
                break;
            case 4 :
                dayOfWeek = "Thursday.";
                break;
            case 5 :
                dayOfWeek = "Friday.";
                break;
            case 6:
                dayOfWeek = "Saturday.";
                break;
            case 7 :
                dayOfWeek = "Sunday";
                break;
            default:
                dayOfWeek = "No such day of week.";
                break;
        }
        return dayOfWeek;
    }

    public static void main(String[] args) {
        System.out.println(nameOfDay(2));
    }

}
