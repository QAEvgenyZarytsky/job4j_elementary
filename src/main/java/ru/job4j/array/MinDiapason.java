package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        if (array.length == 0) {
            System.out.println("Error: array.length = 0!");
        } else if (start > array.length || finish > array.length) {
            System.out.println("Error: start or finish more then array.length!");
        } else if (start > finish) {
            System.out.println("Error: start more then finish");
        } else {
            for (int index = start; index <= finish; index++) {
                if (min > array[index]) {
                    min = array[index];
                }
            }
        }
        return min;
    }
}
