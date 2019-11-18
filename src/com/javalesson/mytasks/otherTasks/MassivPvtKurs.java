package com.javalesson.mytasks.otherTasks;

public class MassivPvtKurs {
    public static void main(String[] args) {
        // Создал массив случайных чисел из 10 элементов
        int sizeMassive = 10;
        int mas[] = new int[sizeMassive];
        System.out.println("My random massive : ");
        for (int i = 0; i < sizeMassive; i++) {
            mas[i] = (int) (Math.random() * 10 + 1);
            System.out.print(mas[i] + " ");
        }

        System.out.println(" ");
        System.out.println("My reverse random massive : ");

        //Создал переменные для обмена значений массива
        int n = mas.length;
        int temp;

        // Цикл для обмена значений массива
        for (int i = 0; i < n / 2; i++) {
            temp = mas[n - i - 1];
            mas[n - i - 1] = mas[i];
            mas[i] = temp;
        }
        // Цикл для вывода обратного массива
        for (int k : mas) {
            System.out.print(k + " ");
        }
    }
}
