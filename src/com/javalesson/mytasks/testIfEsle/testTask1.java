package com.javalesson.mytasks.testIfEsle;
import java.util.Scanner;
public class testTask1 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        if (n%2>0) System.out.println(n+1);
        else System.out.println(n+2);
    }
}
