/*
Среди натуральных чисел от 1 до N(включая N), найдите число наибольшее по сумме цифр.
Вывести это число и сумму его цифр.

Входные данные
В первой строке находится единственное натуральное число N, не превышающее 106.

Выходные данные
Выведите  само число, которое имеет максимальную сумму цифр и саму сумму цифр на одной строке через пробел.
Если таких чисел несколько, выведите минимальное из них.

Sample Input:

20
Sample Output:

19 10
 */

package com.javalesson.mytasks.otherTasks;
import java.util.Scanner;
public class task15 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        int x = 0;
        int y = 0;
        int z ;
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            for (z = i; z > 0; z /= 10) {
                sum = sum + (z % 10);
            }
            if (y < sum) {
                y = sum;
                x = i;
            }
            sum = 0;
        }
        System.out.println(x + " " + y);
    }
}
