package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        System.out.println(upperCase("achim"));
        System.out.printf("ist -5 positiv: "+isPositive(-5));

    }


    public static int sum(int a, int b) {
        return a+b;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }


    public static int product(int d, int e) {
        return d*e;
    }

    public static String upperCase(String achim){
        return achim.toUpperCase();
    }

    public static boolean isPositive(int zahl) {
        return zahl>0;
    }
}
