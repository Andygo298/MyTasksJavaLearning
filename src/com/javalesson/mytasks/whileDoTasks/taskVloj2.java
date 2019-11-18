package com.javalesson.mytasks.whileDoTasks;
// найти количество цифр 7 в числе
import java.util.Scanner;

public class taskVloj2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        int cnt = 0;
        for (int x = 1; x <= n; x++)
        {
            for (int y = x; y > 0; y = y / 10) {
                if (y % 10 == 7)
                {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
