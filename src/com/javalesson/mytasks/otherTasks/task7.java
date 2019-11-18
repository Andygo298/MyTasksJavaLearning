package com.javalesson.mytasks.otherTasks;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int x = sc1.nextInt();
        x = x % 2;
        if (x==0) System.out.println("YES");
        else System.out.println("NO");

    }
}
