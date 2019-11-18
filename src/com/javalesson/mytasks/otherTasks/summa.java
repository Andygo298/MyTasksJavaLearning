package com.javalesson.mytasks.otherTasks;

import java.util.Scanner;

public class summa {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.println("input your numbers: ");
        int a = in1.nextInt();
        int b = in1.nextInt();
        int c = in1.nextInt();
        int sum = a+b+c;
        int mult = a*b*c;
        System.out.println(sum+" "+mult);
    }
}
