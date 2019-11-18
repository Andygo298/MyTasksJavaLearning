package com.javalesson.mytasks.whileDoTasks;
//  сумма всех цифр в натуральном числе
import java.util.Scanner;

public class taskPart2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum+=digit;
            n/=10;
        }
        System.out.println(sum);
    }
}
