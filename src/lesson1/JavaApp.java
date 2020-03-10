package lesson1;

import java.util.Scanner;

public class JavaApp {

    public static void main(String[] args) {
        System.out.println(calculate(1, 2, 3, 4));
        System.out.println(task10and20(12, 3));
        isPositiveOrNegative(-5);
        System.out.println(isNegative(7));
        names("Nick");
        newYear(2020);
    }

    public static void dataType (String[] args) {
        byte a = -121;
        short b = -17583;
        int c = 15;
        long d = 859000035;
        float e = 17.25f;
        double f = 189.91;
        char g = '*';
        boolean bool = true;
    }

    private static int calculate (int a, int b, int c, int d) {
        return a * (b + (c / d));
    }
    public static boolean task10and20 (int x1, int x2){
        if (x1 + x2 >= 10 && x1 + x2 <= 20){
            return true;
        } else {
            return false;
        }
    }

    public static void isPositiveOrNegative (int x) {
        if (x >= 0){
            System.out.println("Это число положительное");
        } else {
            System.out.println("Это число отрицательное");
        }
    }

    public static boolean isNegative (int x) {
        if (x < 0) {
            return true;
        }
        return false;
    }

    public static void names (String name) {
        System.out.println("Привет, " + name);
    }

    public static void newYear(int x) {
        if ((x % 4 == 0 && x % 100 != 0) || (x % 400 == 0)) {
            System.out.println("Этот год високосный");
        } else {
            System.out.println("Этот год невисокосный");
        }
    }
}
