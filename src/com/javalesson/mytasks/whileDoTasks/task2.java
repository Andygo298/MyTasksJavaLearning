package com.javalesson.mytasks.whileDoTasks;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        int cnt = 0;
        while (a % 3 == 0) {
            a = a / 3;
            cnt++;
        }
        System.out.println(cnt);
    }
}
