package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean exp = data[0];
        for (boolean b : data) {
            if (b != exp) {
                result = false;
                break;
            }
        }
        return result;
    }
}
