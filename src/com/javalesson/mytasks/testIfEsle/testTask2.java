package com.javalesson.mytasks.testIfEsle;

import java.util.Scanner;

public class testTask2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        double a = sc1.nextDouble();
        double b = sc1.nextDouble();
        if ((a % b) == 0) System.out.println((int) (a / b));
        else System.out.println((int) Math.ceil(a / b));
    }
}
