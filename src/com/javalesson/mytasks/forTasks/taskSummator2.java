package com.javalesson.mytasks.forTasks;

import java.util.Scanner;

public class taskSummator2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int pcs = sc1.nextInt();
        int sum = 0;
        for (int x = 1; x <= pcs; x++) {
            sum += sc1.nextInt();
        }
        System.out.println(sum);
    }
}
