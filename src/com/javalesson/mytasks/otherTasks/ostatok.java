package com.javalesson.mytasks.otherTasks;

import java.util.Scanner;

public class ostatok {
        public static void main(String[] args) {
            Scanner sc1 = new Scanner(System.in);
            double x = sc1.nextDouble();
            x = x*10;
            x = (int) (x%10);

            System.out.println(x);
    }
}
