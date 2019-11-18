package com.javalesson.mytasks.otherTasks;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        int x = a/100; //1
        int y = (a/10)%10; //2
        int z = (a%100)%10; //5
        if (x != y && x != z && y != z) System.out.println("YES");
        else System.out.println("NO");
    }
}
