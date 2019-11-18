package com.javalesson.mytasks.whileDoTasks;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        int b = sc1.nextInt();
        while (a * b != 0) {
            if (a > b) {
                a = a % b;
            } else b = b % a;
        }
        System.out.println(a+b);
    }
}
