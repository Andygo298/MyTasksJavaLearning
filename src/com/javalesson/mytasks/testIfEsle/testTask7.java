package com.javalesson.mytasks.testIfEsle;

import java.util.Scanner;

public class testTask7 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int x1 = sc1.nextInt();
        int y1 = sc1.nextInt();
        int x2 = sc1.nextInt();
        int y2 = sc1.nextInt();
        boolean first = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)) == Math.sqrt(5);
        System.out.println(first ? "YES" : "NO");
    }
}
