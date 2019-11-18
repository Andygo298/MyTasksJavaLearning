package com.javalesson.mytasks.testIfEsle;

import java.util.Scanner;

public class testTask4 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        if (a % 2 == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}
