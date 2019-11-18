package com.javalesson.mytasks.testIfEsle;

import java.util.Scanner;

public class testTask9 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        int b = sc1.nextInt();
        int c = sc1.nextInt();
        if(a == 0 || b  == 0 || c  == 0) System.out.println("NO");
        else if(a >= b && a >= c) System.out.println(a < b+c ? "YES" : "NO");
        else if(b >= a && b >= c) System.out.println(b < a+c ? "YES" : "NO");
        else System.out.println(c < a+b ? "YES" : "NO");
    }
}
