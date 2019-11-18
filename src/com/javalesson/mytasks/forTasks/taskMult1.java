package com.javalesson.mytasks.forTasks;

import java.util.Scanner;

public class taskMult1 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int x = sc1.nextInt();
        int fact = 1;
        for (int y = 1; y <= x; y++){
            fact*=y;
        }
        System.out.println(fact);
    }
}
