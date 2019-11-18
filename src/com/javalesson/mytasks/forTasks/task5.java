package com.javalesson.mytasks.forTasks;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        for (int num = 1; num <= a; num++) {
            System.out.println((int)Math.pow(num, 2));
        }
    }
}
