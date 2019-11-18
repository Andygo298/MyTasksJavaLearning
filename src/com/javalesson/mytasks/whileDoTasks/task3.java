package com.javalesson.mytasks.whileDoTasks;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        int stepen = 1;
        while (stepen<=n){
            System.out.println(stepen);
            stepen = stepen*2;
        }
    }
}
