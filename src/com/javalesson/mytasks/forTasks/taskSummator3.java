package com.javalesson.mytasks.forTasks;

import java.util.Scanner;

public class taskSummator3 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int pcs = sc1.nextInt();
        int sum = 0;
        for (int x = 1; x <= pcs; x++) {
            int y = sc1.nextInt();
            if (y % 2 == 0 && y % 3 != 0) sum+=y;
        }
        System.out.println(sum);
    }
}
