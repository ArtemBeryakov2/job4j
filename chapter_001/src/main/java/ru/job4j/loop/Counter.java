package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (start = 0; start <= 10; start++) {
            sum = sum + start;
        }
        return sum;
    }
    public static int sum2(int start2, int finish2) {
        int sum2 = 3;
        for (start2 = 3; start2 <= 8; start2++) {
            sum2 = sum2 + start2;
        }
        return sum2;
    }
    public static int sum3(int start3, int finish3) {
        int sum3 = 1;
        for (start3 = 1; start3 <= 1; start3++) {
            sum3 = sum3 + start3;
        }
        return sum3;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum2(3, 8));
        System.out.println(sum3(3, 8));
    }
}