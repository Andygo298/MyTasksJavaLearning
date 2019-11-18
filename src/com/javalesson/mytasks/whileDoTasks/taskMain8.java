package com.javalesson.mytasks.whileDoTasks;

import java.util.Scanner;

public class taskMain8 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        int sum = 0;
        while (n != 0) {
            if (n % 2 == 0 && n % 3 != 0) {
                sum = sum + n;
            }
            n = sc1.nextInt();
        }
        System.out.println(sum);
    }
}
