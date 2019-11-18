package com.javalesson.mytasks.forTasks;

import java.util.Scanner;

public class taskSummator1 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int x = sc1.nextInt();
        int cntr = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                cntr++;
            }
        }
        System.out.println(cntr);
    }
}
