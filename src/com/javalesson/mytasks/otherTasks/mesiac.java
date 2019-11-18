package com.javalesson.mytasks.otherTasks;

import java.util.Scanner;

public class mesiac {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String month = sc1.next();
        switch (month)
        {
            case "2": System.out.println(29); break;
            case "4": case "6": case "9": case "11": System.out.println(30); break;
            default: System.out.println("31"); break;
        }
    }
}
