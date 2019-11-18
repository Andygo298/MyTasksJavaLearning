/*
Найдите максимальный делитель числа N, отличный от N.
Входные данные
Вводится одно натуральное число N, не превышающее 107.
Выходные данные
Вывести максимальный делитель числа N, отличный от N.
Примечание: гарантируется, что он всегда существует.
*/

package com.javalesson.operators;

import java.util.Scanner;

public class BrkAndCnt {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int x = sc1.nextInt();
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {System.out.println(x / i); break;}
        }
    }
}
