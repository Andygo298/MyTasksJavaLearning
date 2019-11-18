package com.javalesson.mytasks.whileDoTasks;

import java.util.Scanner;

public class taskMain11 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        int x = 0;
        int cnt = 0;
        while (n != 0) {
            x = n ;
            n = sc1.nextInt();
            if(n>x) cnt++;
        }
        System.out.println(cnt);
    }
}
