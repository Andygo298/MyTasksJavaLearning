package com.javalesson.mytasks.otherTasks;

import java.util.Scanner;

public class mult {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("input number: ");
        int a = sc1.nextInt(); //2
        int b = a*a*a;
        int c = b*b;
        System.out.println(c);
    }

}
