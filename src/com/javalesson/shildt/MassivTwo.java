package com.javalesson.shildt;

public class MassivTwo {
    public static void main(String[] args) {
        int[][] mass1 = {{1, 2, 3, 4, 5}, {6, 7, 8}, {9, 10, 11, 12, 13}, {14, 15}};
        for (int i = 0; i < mass1.length; i++) {
            for (int k = 0; k < mass1[i].length; k++) {
                System.out.print(mass1[i][k] + " ");
            }
            System.out.println();
        }
    }
}
