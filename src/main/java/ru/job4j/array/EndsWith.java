package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;
        if (postfix.length > word.length) {
            System.out.println("Error: postfix.length more then world.length!");
            result = false;
        } else {
            for (int index = 0; index < postfix.length; index++) {
                if (word[word.length - 1 - index] != postfix[postfix.length - 1 - index]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
