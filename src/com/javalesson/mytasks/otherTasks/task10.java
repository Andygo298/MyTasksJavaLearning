package com.javalesson.mytasks.otherTasks;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int num = sc1.nextInt();
        int x = num / 1000; //235
        int y = num % 1000; //640
        x = x/100 + (x/10)%10 + (x%100)%10; //sum = 10
        y = y/100 + (y/10)%10 + (y%100)%10; //sum = 10
        System.out.println(x == y ? "YES" : "NO");
    }
}
