package com.javalesson.mytasks.forTasks;

import java.util.Scanner;

public class taskMult3 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        int b = sc1.nextInt();
        int mult = 1;
        for (int c = a; c <= b; c++) {
            if (c % 10 == 7) mult *=c;
        }
        System.out.println(mult);
    }
}
