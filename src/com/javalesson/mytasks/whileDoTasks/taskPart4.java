package com.javalesson.mytasks.whileDoTasks;
// совершенное число -- число делиться на сумму своих цифр без остатка
import java.util.Scanner;

public class taskPart4 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        int x = n;
        int sum = 0;
        while (x > 0) {
            int digit = x % 10;
            sum += digit;
            x /= 10;
        }
        if(n%sum==0) System.out.println("YES");
        else System.out.println("NO");
    }
}
