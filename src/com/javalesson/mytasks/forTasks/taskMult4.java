package com.javalesson.mytasks.forTasks;

import java.util.Scanner;

public class taskMult4 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        int mult = 1;
        for (int x = 1; x <= n; x++) {
            if (x%2==0) mult*=x;
        }
        System.out.println(mult);
    }
}
