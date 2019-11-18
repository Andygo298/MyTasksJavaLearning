package com.javalesson.mytasks.forTasks;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        int b = sc1.nextInt();
        for (int num = a; num <= b; num++) {
            if (num % 2 == 0) System.out.println(num);
        }
    }
}
