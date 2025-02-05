package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int max = first;
        if (second > first) {
            max = second;
        }
        if (third > max) {
            max = third;
        }
        return max;
    }
}
