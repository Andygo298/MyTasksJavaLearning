package com.javalesson.mytasks.otherTasks;

import java.util.Scanner;

public class zamena {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.println("input number 1:");
        int num1 = in1.nextInt(); //5
        System.out.println("input number 2:");
        int num2 = in1.nextInt(); //10
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println(num1 + " " + num2);


    }

}
