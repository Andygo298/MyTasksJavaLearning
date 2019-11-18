package com.javalesson.mytasks.otherTasks;

public class SortedMassiv {
    public static void main(String[] args) {
        int marks[] = {3, 5, 4, 8, 9, 2, 2, 10};
        for (int i = 0; i < marks.length - 1; i += 2) {
            int t = marks[i];
            marks[i] = marks[i + 1];
            marks[i + 1] = t;
        }
        for (int i = 0; i < marks.length; i++) {
            System.out.println("m[" + i + "]=" + marks[i]);
        }
    }
}
