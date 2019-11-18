package com.javalesson.mytasks.otherTasks;

import java.util.Scanner;

public class perimetr {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        double a = sc1.nextDouble();
        double b = sc1.nextDouble();
        double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        double prmtr = a+b+c;
        System.out.println(prmtr);
    }
}
