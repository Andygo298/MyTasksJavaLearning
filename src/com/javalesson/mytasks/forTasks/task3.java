package com.javalesson.mytasks.forTasks;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        for (int num = 1; num <= a; num++) {
            if (a % num == 0) System.out.println(num);
        }
    }
}
