package com.javalesson.mytasks.whileDoTasks;
//на отрезке от а до b найти числа у которых делителей больше чем К
import java.util.Scanner;

public class taskVloj1 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt(); //1
        int b = sc1.nextInt(); //10
        int k = sc1.nextInt(); //3
        int cnt = 0;
        for (int i = a; i <= b; i++)
        {
            for (int m = 1; m <= i; m++)
            {
                if (i % m == 0)
                {
                    cnt++;
                }
            }
            if (cnt >= k)
            {
                System.out.print(i + " ");
            }
            cnt = 0;
        }
    }
}
//        for (int j = a; j <= b; j++) {
//            int cnt = 0;
//            for (int i = 1; i <= b; i++)
//            {
//                if (j % i == 0)
//                {
//                    cnt++;
//                }
//            }
//            if (cnt>=k){
//                System.out.print(j+" ");
//                cnt = 0;
//            }
//        }

