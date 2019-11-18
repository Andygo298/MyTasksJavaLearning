/*
Вывести представление целого числа N в виде произведения простых чисел.
Входные данные
В первой строке находится единственное натуральное число N, где 2≤N≤2147483647.
Выходные данные
Выведите список чисел в порядке не убывания через пробел.
Sample Input 1:
6
Sample Output 1:
2 3
Sample Input 2:
30
Sample Output 2:
2 3 5
Sample Input 3:
16
Sample Output 3:
2 2 2 2
*/

package com.javalesson.mytasks.otherTasks;

import java.util.Scanner;

public class task16 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        for (int s = 2; s < n; s++) {
            while (n % s == 0) {
                System.out.print(s + " ");
                n /= s;
            }
        }
        if (n > 1) System.out.print(n);
    }
}
