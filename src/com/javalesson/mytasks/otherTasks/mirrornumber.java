package com.javalesson.mytasks.otherTasks;

import java.util.Scanner;

public class mirrornumber {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int m = sc1.nextInt();
        int a = (m % 10) * 100; //3
        int b = (m / 10) % 10 * 10; //2
        int c = m / 100; //1
        System.out.println(a + b + c);
    }
}
