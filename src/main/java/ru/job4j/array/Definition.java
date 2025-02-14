package ru.job4j.array;

import java.sql.SQLOutput;

public class Definition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Ivan Dorofeev";
        names[1] = "Olga Knyazeva";
        names[2] = " Mary Knyazeva";
        names[3] = "Mikhail Knyazev";
        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);
    }
}
