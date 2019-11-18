package com.javalesson.mytasks.otherTasks;

public class StrinPvtKurs {
    public static void main(String[] args) {
        String s = "test 11111 string";
        int n = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                n++;
                if (n >= 4) break;
            }
            else n = 0;
        }
        if (n >= 4) System.out.println("You have 5 equal symbols in string.");
        else System.out.println("You don't have 5 equal symbols in string.");
    }
}
