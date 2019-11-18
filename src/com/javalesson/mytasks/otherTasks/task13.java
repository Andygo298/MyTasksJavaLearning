package com.javalesson.mytasks.otherTasks;

import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int x = sc1.nextInt();
        int y = sc1.nextInt();
        if (x>0 && y>0) System.out.println(1);
        else if (x<0 && y>0) System.out.println(2);
        else if (x<0 && y<0) System.out.println(3);
        else System.out.println(4);
    }
}
