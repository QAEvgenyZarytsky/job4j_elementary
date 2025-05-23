package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        int counter = 1;
        char checkLetter = input.charAt(0);
        for (int i = 1; i < input.length(); i++) {
            if (checkLetter == input.charAt(i)) {
                counter++;
            } else {
                stringBuilder.append(checkLetter).append((counter > 1) ? counter : "");
                checkLetter = input.charAt(i);
                counter = 1;
            }
        }
        stringBuilder.append(checkLetter).append((counter > 1) ? counter : "");
        return stringBuilder.toString();
    }
}
