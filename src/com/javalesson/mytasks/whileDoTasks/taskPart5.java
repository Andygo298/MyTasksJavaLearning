package com.javalesson.mytasks.whileDoTasks;
//Вывести число в обратном порядке

import java.util.Scanner;

public class taskPart5 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        int x = n;
        while (x > 0) {
            int digit = x % 10;
            System.out.print(digit);
            x /= 10;
        }
    }
}
