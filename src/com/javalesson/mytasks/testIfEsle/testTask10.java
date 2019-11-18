package com.javalesson.mytasks.testIfEsle;

import java.util.Scanner;

public class testTask10 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        int b = sc1.nextInt();
        int c = sc1.nextInt();
        int max;
        int mid;
        int min;
        if (a > b && a > c) {
            max = a;
            if (b >= c) {
                mid = b;
                min = c;
            } else {
                mid = c;
                min = b;
            }
        } else if (b > a && b > c) {
            max = b;
            if (a >= c) {
                mid = a;
                min = c;
            } else {
                mid = c;
                min = a;
            }
        } else {
            max = c;
            if (a >= b) {
                mid = a;
                min = b;
            } else {
                mid = b;
                min = a;
            }
        }
        double sum = Math.pow(mid, 2) + Math.pow(min, 2);
        if (max < mid + min) {
            if (Math.pow(max, 2) == sum) {
                System.out.println("right");
            } else if (Math.pow(max, 2) < sum) {
                System.out.println("acute");
            } else if (Math.pow(max, 2) > sum) {
                System.out.println("obtuse");
            }
        } else System.out.println("impossible");
    }
}
