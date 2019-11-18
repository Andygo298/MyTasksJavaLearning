package com.javalesson.mytasks.otherTasks;

import java.util.Scanner;

public class kvadrat {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.println("Введи число: ");
        int num = in1.nextInt();
        double squareNum = Math.pow(num,2);
        System.out.println("Число "+num+" в квадрате = "+squareNum);
        in1.close();
    }
}
