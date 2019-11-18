package com.javalesson.mytasks.otherTasks;

import java.util.Scanner;

public class taskkonik {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int x1 = sc1.nextInt();
        int y1 = sc1.nextInt();
        int x2 = sc1.nextInt();
        int y2 = sc1.nextInt();
        System.out.println(Math.abs(x1 - x2) == Math.abs(y1 - y2) ? "YES" : "NO");
    }
}
