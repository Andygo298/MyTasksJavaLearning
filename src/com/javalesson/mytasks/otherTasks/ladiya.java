package com.javalesson.mytasks.otherTasks;

import java.util.Scanner;

public class ladiya {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        int b = sc1.nextInt();
        int c = sc1.nextInt();
        int d = sc1.nextInt();
        if ((b == d) || (a == c)) System.out.println("YES");
        else System.out.println("NO");
    }
}
