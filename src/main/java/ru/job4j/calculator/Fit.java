package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        return  (height - 100) * 1.15;

    }

    public static double womanWeight(short height) {
        return  (height - 110) * 1.15;

    }

    public static void main(String[] args) {
        short height = 187;
        double man = manWeight(height);
        System.out.println("Man 187 is " + man);
        short height1 = 160;
        double woman = womanWeight(height1);
        System.out.println("Woman 160 is " + woman);
    }
}
