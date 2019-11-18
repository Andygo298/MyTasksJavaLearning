package com.javalesson.mytasks.otherTasks;

import java.util.Scanner;

public class poragoda {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String poraGoda = sc1.next();
        switch (poraGoda){
            case "12": case "1": case"2": System.out.println("ЗИМА"); break;
            case "3": case "4": case "5": System.out.println("ВЕСНА"); break;
            case "6": case "7": case "8": System.out.println("ЛЕТО"); break;
            case "9": case "10": case "11": System.out.println("ОСЕНЬ"); break;
        }
    }
}
