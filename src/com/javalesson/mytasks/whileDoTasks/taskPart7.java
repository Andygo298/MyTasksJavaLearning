package com.javalesson.mytasks.whileDoTasks;
// перевод числа из десятичной в двоичную систему

import java.util.Scanner;

//public class taskPart7 {
    //    public static void main(String[] args) {
//        Scanner sc1 = new Scanner(System.in);
//        int decimal = sc1.nextInt();
//        String binary = "";
//        while (decimal > 0) {
//            binary = (decimal % 2) + binary;
//            decimal/=2;
//        }
//        System.out.println(binary);
//    }

class Main {
    public static void main(String[] args) {
        int a = 1;boolean q = false;
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        while(a <= n){
            a *= 2;
        }
        a /= 2;
        while(a != 0){
            if(n - a >= 0){
                n -= a;
                System.out.print(1);
            }
            else{
                System.out.print(0);
            }
            a /= 2;
        }
    }
}