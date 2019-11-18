package com.javalesson.mytasks.whileDoTasks;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        int i = 1;
        while (i*i<=n){
            System.out.println(i*i);
            i++;
        }
    }
}
