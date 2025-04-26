package ru.job4j.loop;

public class PrimeNumber {
    public static int calc(int finish) {
        if (finish < 2) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i <= finish; i++) {
            if (CheckPrimeNumber.check(i)) {
                count++;
            }
        }
        return count;
    }
}
