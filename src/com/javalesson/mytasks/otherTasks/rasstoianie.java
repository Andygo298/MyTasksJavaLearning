package com.javalesson.mytasks.otherTasks;

import java.util.Scanner;

public class rasstoianie {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        double x1 = sc1.nextDouble();
        double y1 = sc1.nextDouble();
        double x2 = sc1.nextDouble();
        double y2 = sc1.nextDouble();
        double rast = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println(rast);
    }
}
