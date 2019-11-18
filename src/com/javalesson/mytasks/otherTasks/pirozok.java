package com.javalesson.mytasks.otherTasks;

import java.util.Scanner;

public class pirozok {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Vvedite dannye: ");
        int rub = sc1.nextInt(); //1
        int kop = sc1.nextInt(); //30
        int pcs = sc1.nextInt(); //5

        int sumRub = rub * pcs; //5
        int sumKop = kop * pcs; //150
        if(sumKop>=100){
            int ddd = sumKop/100; //1
            int ost = sumKop%100; //50
            sumRub = sumRub+ddd;
            sumKop = ost;
        }
        System.out.println(sumRub+" "+sumKop);

//        int b1 = (a*100 + b) * c; // стоимость пирожков в копейках
//        System.out.println(b1/100 + " " + b1%100);
    }
}
