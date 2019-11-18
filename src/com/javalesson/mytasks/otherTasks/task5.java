package com.javalesson.mytasks.otherTasks;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        double n = sc1.nextDouble(); //9
        double k = sc1.nextDouble(); //43
        double kk = k % n; //7
        int nn = (int) (n - kk); //2
        int xx = (int) (nn%n);
        System.out.println(xx);
    }
}
