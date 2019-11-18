package com.javalesson.mytasks.whileDoTasks;
//десятичное число в двоичное в обратном порядке

import java.util.Scanner;

public class taskPart6 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        while (n > 0) {
            System.out.print(n % 2);
            n /= 2;
        }
    }
}
