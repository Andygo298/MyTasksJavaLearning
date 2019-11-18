package com.javalesson.mytasks.forTasks;

import java.util.Scanner;

public class taskSummator5 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int pcs = sc1.nextInt();
        int a = 0;
        for (int x = 1; x <= pcs; x++) {
            int y = sc1.nextInt();
            if (y==0) a++;
        }
        if(a>0) System.out.println("YES");
        else System.out.println("NO");
    }
}
