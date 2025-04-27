package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] prefix) {
        boolean result = true;
        if (prefix.length > word.length) {
            System.out.println("Error: prefix.length more then world.length!");
            result = false;
        } else {
            for (int index = 0; index < prefix.length; index++) {
                if (word[index] != prefix[index]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
