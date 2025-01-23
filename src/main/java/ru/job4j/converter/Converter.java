package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("140 rubles are 2. Test result : " + passed);
        float dollar = rubleToDollar(240);
        System.out.println("240 rubles are " + dollar + " dollar.");
        float input1 = 240;
        float expected1 = 4;
        float output1 = Converter.rubleToDollar(input1);
        boolean passed1 = expected1 == output1;
        System.out.println("240 rubles are 4. Test result : " + passed1);
    }
}
