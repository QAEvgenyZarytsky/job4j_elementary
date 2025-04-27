package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        for (int index = 0; index < array.length - 1; index++) {
            for (int step = index + 1; step < array.length; step++) {
                if (array[index] > array[step]) {
                    int temp = array[index];
                    array[index] = array[step];
                    array[step] = temp;
                }
            }
        }
        for (int i : array) {
            System.out.println(i);
        }
    }
}
