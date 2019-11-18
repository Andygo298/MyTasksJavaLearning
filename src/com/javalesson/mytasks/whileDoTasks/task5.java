package com.javalesson.mytasks.whileDoTasks;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt(); //9
        int pokazatel = 0; // 4
        int stepen = 1; // 16
        while (n > stepen) {
            stepen = stepen * 2;
            pokazatel++;
        }
        System.out.println(pokazatel);
    }
}
