package com.javalesson.mytasks.otherTasks;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        int num = in1.nextInt();
        int a = (num % 10);
        int b = (num % 100) / 10;
        int c = (num % 1000) /100;
        System.out.println(a+b+c);
    }
}
