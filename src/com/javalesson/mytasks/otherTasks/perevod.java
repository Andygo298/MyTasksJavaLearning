package com.javalesson.mytasks.otherTasks;

import java.util.Scanner;

public class perevod {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        double b = sc1.nextDouble();
        int c = (int) (b / Math.pow(2,13));
        System.out.println(c);
    }
}
