package com.javalesson.mytasks.whileDoTasks;

import java.util.Scanner;

public class taskMain12 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        int cnt = 0;
        int x = 0;
        while (n != 0) {
            x = n;
            n = sc1.nextInt();
            if (n < 0 && x > 0 || x < 0 && n > 0) cnt++;
        }
        System.out.println(cnt);
    }
}
