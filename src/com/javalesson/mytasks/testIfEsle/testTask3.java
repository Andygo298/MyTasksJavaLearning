package com.javalesson.mytasks.testIfEsle;

import java.util.Scanner;

public class testTask3 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        double a = Math.ceil((sc1.nextDouble()) / 2);
        double b = Math.ceil((sc1.nextDouble()) / 2);
        double c = Math.ceil((sc1.nextDouble()) / 2);
        System.out.println((int) (a + b + c));
//        double b = sc1.nextDouble();
//        double c = sc1.nextDouble();
//        if ((a % 2) > 0){
//            a = a + 1;
//        }
//        if ((b % 2) > 0){
//            b = b + 1;
//        }
//        if ((c % 2) > 0){
//            c = c + 1;
//        }
//        System.out.println((int)(Math.ceil(a+b+c)/2));
    }
}
