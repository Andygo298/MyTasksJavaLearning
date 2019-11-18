package com.javalesson.mytasks;
import java.util.Scanner;
public class WestCalendar {
    public static void main(String[] args) {
        String[] x = {"white ", "white ", "black ", "black ", "green ", "green ", "red ", "red ", "yellow ", "yellow "};
        String[] y = {"rat", "cow", "tiger", "rabbit",
                "dragon", "snake", "horse", "sheep",
                "monkey", "chicken", "dog", "pig"};
        System.out.println("Please, enter year in range 1900-2179гг : ");
        Scanner sc1 = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int year = sc1.nextInt();
            try {
                if (year < 1900 || year > 2179 ) throw null;
                System.out.println("This is a" + " " + x[year % x.length] + y[(year - 1900 + y.length) % y.length]+" year.");
            }
            catch (Exception wrong) {
                    System.out.println("Wrong value, end programm...");
                break;
            }
        }
        sc1.close();
    }
}

