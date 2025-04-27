package ru.job4j.array;

public class FindLoop {
    public static int indexInRange(int[] data, int element, int start, int finish) {
        int result = -1;
        if (data.length == 0) {
            System.out.println("Error: data.length = 0!");
        } else if (start > data.length || finish > data.length) {
            System.out.println("Error: start or finish more then data.length!");
        } else if (start > finish) {
            System.out.println("Error: start more then finish!");
        } else {
            for (int index = start; index < data.length - (data.length - 1 - finish); index++) {
                if (data[index] == element) {
                    result = index;
                    break;
                }
            }
        }
        return result;
    }

    public static int indexOf(int[] data, int element) {
        int result = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == element) {
                result = index;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] d = new int[]{5, 10, 3};
        int element = 5;
        System.out.println(indexOf(d, element));
    }
}
