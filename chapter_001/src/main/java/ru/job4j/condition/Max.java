package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }
    public static int max2(int left, int right) {
        int result = left < right ? left : right;
        return result;
    }
    public static int same(int left, int right) {
        int result = left == right ? left : right;
        return result;
    }
}