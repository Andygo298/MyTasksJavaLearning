package com.javalesson.mytasks.otherTasks;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int x = sc1.nextInt();
        int y = sc1.nextInt();
        if ((x%y)==0) System.out.println("YES");
        else System.out.println("NO");
    }
}
