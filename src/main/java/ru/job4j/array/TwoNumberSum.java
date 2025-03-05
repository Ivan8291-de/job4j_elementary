package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] result = new int[0];
        int i = 0;
        int j = 0;
        while (i < array.length && j < array.length) {
            if (array[i] + array[j] == target && i != j) {
                result = new int[]{i, j};
            }
            if (j == array.length - 1 && array.length > 2) {
             i++;
             j = i + 1;
            } else {
                j++;
            }
        }
        return result;
    }
}
