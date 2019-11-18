package com.javalesson.mytasks.otherTasks;

import java.util.Scanner;

public class summachisla {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int num1 = sc1.nextInt();
        int a = (num1 / 100) % 10; //1
        int b = (num1 / 10) % 10; //2
        int c = num1 % 10; //5
        System.out.println(a + b + c);
    }
}
