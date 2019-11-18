package com.javalesson.mytasks.whileDoTasks;

import java.util.Scanner;

public class taskMain9 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        int cntX = 0;
        int cntY = 0;
        while (n != 0) {
            if (n > 0) {
                cntX++;
                n = sc1.nextInt();
            } else {
                cntY++;
                n = sc1.nextInt();
            }
        }
        System.out.println(cntX - cntY);
    }
}
