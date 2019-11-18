package com.javalesson.mytasks.otherTasks;

import java.util.Scanner;

public class ploschadkruga {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        double rad = sc1.nextDouble();
        double ploschad = Math.pow(rad,2) * Math.PI;
        System.out.println(ploschad);

    }
}
