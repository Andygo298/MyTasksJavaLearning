package com.javalesson.mytasks.otherTasks;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int x = sc1.nextInt();
        int y = sc1.nextInt();
        int z = sc1.nextInt();
        if (x == y && x == z) System.out.println(3);
        else if (x == y || y == z || x == z) System.out.println(2);
        else System.out.println(0);
    }
}
