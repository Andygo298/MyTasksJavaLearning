package com.javalesson.operators;

public class Oper1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int r = 3;
        int p = r * 2;
        System.out.println(p);
        int c = (int) (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
        System.out.println(c);
        if (p > c) {
            System.out.println("Закроет");
        } else System.out.println("Не закроет");
    }
}
