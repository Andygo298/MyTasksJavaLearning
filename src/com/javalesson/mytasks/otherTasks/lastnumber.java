package com.javalesson.mytasks.otherTasks;

import java.util.Scanner;

public class lastnumber {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Please, input 1024");
        int num1 = sc1.nextInt()/10;
        int num2 = num1%10;
        System.out.println(num2);
    }
}
