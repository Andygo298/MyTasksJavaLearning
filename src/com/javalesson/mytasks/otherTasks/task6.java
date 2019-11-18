package com.javalesson.mytasks.otherTasks;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int x = sc1.nextInt();
        if (x<0) {
            x = -1;
        }else if(x==0) {
            x = 0;
        }else x = 1;
        System.out.println(x);
    }
}
