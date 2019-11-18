package com.javalesson.operators;

import java.util.Scanner;

public class Oper2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int x = sc1.nextInt();
        int y = (x % 100) / 10;
        if (y == 1) System.out.println(x + " рублей.");
        else {
            switch (x % 10) {
                case 1: System.out.println(x + " рубль."); break;
                case 2: case 3: case 4: System.out.println(x + " рубля."); break;
                default: System.out.println(x + " рублей.");
            }
        }
    }
}
