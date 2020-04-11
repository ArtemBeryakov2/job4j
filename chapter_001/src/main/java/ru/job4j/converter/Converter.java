package ru.job4j.converter;

public class Converter {

    public static int rubleToDollar(int value) {

        return value / 60;
    }

    public static int rubleToEuro(int value) {

        return value / 70;
    }



    public static void main(String[] args) {
        int in = 180;
        int expected = 3;
        int out = rubleToDollar(in);
        boolean passed = expected == out;
        System.out.println("180 rubles are 3. Test result : " + passed);
    }
}

