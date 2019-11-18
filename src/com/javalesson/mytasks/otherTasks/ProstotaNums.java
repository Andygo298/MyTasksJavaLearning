package com.javalesson.mytasks.otherTasks;

import java.util.Scanner;

public class ProstotaNums {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int x = sc1.nextInt();
        boolean isComposite = false;
        for (int i = 2; i < x; i++) {
            if(x%i==0) {
                isComposite = true;
                break;
            }
        }
        System.out.println(isComposite ? "sostavnoe" : "prostoje");
    }
}
