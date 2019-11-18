package com.javalesson.mytasks.otherTasks;

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        double a = sc1.nextDouble();
        double b = sc1.nextDouble();
        double c = sc1.nextDouble();
        double diskr = Math.pow(b, 2) - 4 * a * c;
        if (diskr > 0) {
            double x1 = (-b + Math.sqrt(diskr)) / (2 * a);
            double x2 = (-b - Math.sqrt(diskr)) / (2 * a);
            if(x1<x2) {
                System.out.println(x1);
                System.out.println(x2);
            }else {
                System.out.println(x2);
                System.out.println(x1);
            }
        } else if (diskr == 0) {
            double x = -b / (2 * a);
            System.out.println(x);
        }
    }
}
