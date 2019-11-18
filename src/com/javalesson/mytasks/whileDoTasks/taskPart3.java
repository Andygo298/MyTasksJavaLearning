package com.javalesson.mytasks.whileDoTasks;
// количество цифр 4 в числе
import java.util.Scanner;

public class taskPart3 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        int cnt = 0;
        while (n > 0) {
            if (n % 10 == 4) cnt++;
            n /= 10;
        }
        System.out.println(cnt);
    }
}
