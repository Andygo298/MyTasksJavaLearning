package com.javalesson.mytasks.otherTasks;

import java.util.Scanner;

public class SumaNumb {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int x = sc1.nextInt();
        int sum = 0;
        while (x != 0) {
            sum = sum + (x % 10);
            x = x / 10;
        }
        System.out.println("Summa = " + sum);
    }
}
