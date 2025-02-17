package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int index = 0; index < a.length; index++) {
            a[index] = index * 2 + 3;
        }
        for (int index : a) {
            System.out.println(index);
        }
    }
}
