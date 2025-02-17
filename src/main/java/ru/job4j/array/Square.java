package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] result = new int[bound];
        for (int stepen = 0; stepen < result.length; stepen++) {
            result[stepen] = (int) Math.pow(stepen, 2);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
