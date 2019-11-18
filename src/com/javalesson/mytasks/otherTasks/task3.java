package com.javalesson.mytasks.otherTasks;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int a1 = sc1.nextInt();
        int d = sc1.nextInt();
        int n = sc1.nextInt();
        int an = a1 + d * (n - 1);
        System.out.println(an);

    }
}
