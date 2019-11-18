package com.javalesson.mytasks.otherTasks;

import java.util.Scanner;

public class delenie {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("input students: ");
        int students = sc1.nextInt();
        System.out.println("input apples: ");
        int apples = sc1.nextInt();
        int total = apples % students;
        System.out.println(total);

    }
}
