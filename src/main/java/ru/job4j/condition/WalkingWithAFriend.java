package ru.job4j.condition;

public class WalkingWithAFriend {
    public static String answer(String question) {
        String result = "I will answer latter.";
        if ("Are you free today?".equals(question)) {
          result = "Yes.";
        } else if ("Can we meet today?".equals(question)) {
            result = "No, i`m busy.";
        }
        return result;
    }

    public static void main(String[] args) {
      String result = answer("Can we meet today?");
        System.out.println(result);
       result = answer("How are you?");
        System.out.println(result);
    }
}