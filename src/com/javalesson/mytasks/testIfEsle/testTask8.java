package com.javalesson.mytasks.testIfEsle;

import java.util.Scanner;

public class testTask8 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String str = sc1.next();
        System.out.println(str.charAt(0)<str.charAt(1) && str.charAt(1)<str.charAt(2) ? "YES" : "NO");
    }
}
