package com.javalesson.mytasks.whileDoTasks;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        int pokazatel = 0;
        int stepen = 1;
        while (pokazatel<n){
            stepen = stepen * 2;
            pokazatel++;
        }
        System.out.println(stepen);
    }
}
