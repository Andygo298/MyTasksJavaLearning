package com.javalesson.mytasks.otherTasks;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int x = sc1.nextInt();
        if ((x >= 5 && x <= 9) || (x >= -3 && x <= 1)) System.out.println("YES");
        else System.out.println("NO");
    }
}
