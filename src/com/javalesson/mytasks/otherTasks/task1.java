package com.javalesson.mytasks.otherTasks;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        double ab = sc1.nextDouble();
        double bc = sc1.nextDouble();
        double ac = Math.sqrt((Math.pow(ab,2)+Math.pow(bc,2)));
        ac = Math.round(ac*1000)/1000d;
        System.out.println(ac);
        }

    }

