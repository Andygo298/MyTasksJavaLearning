package com.javalesson.mytasks.forTasks;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        int b = sc1.nextInt();
        for(;b>=a;b--){
            System.out.println(b);
        }
    }
}
