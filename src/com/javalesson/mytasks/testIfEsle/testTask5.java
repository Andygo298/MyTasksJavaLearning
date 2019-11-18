package com.javalesson.mytasks.testIfEsle;

import java.util.Scanner;

public class testTask5 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int x1 = sc1.nextInt();
        int y1 = sc1.nextInt();
        int x2 = sc1.nextInt();
        int y2 = sc1.nextInt();
        boolean diagonalLine = Math.abs(x1 - x2) == Math.abs(y1 - y2);
        boolean straightLine = y1 == y2 || x1 == x2;
        System.out.println(diagonalLine || straightLine ? "YES" : "NO");
    }

}
