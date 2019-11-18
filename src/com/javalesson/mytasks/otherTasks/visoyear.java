package com.javalesson.mytasks.otherTasks;

import java.util.Scanner;

public class visoyear {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int year = sc1.nextInt();
        if ((year %4==0 && year %100!=0) || (year %400==0))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }

    }
}
