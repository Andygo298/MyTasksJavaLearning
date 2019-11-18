package com.javalesson.mytasks.whileDoTasks;

import java.util.Scanner;

public class taskMain10 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        int sum = 0;
        int cnt = 0;
        while (n != 0) {
            sum += n;
            cnt++;
            n = sc1.nextInt();
        }
        System.out.println((double)(sum / cnt));
    }
}
