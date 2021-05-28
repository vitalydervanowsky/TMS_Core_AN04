package Lesson3;

// Дано число n, заполнить массив длинны n случайными числами из отрезка [-15; 17]
// 2.1) Найти наименьший нечетный элемент.
// 2.2) Найти второй по максимальности элемент массива (т.е. из чисел 1 2 3 4 - 3 будет вторым по максимальности)
// 2.3) Найти максимальный элемент массива и поменять его местами с 1-м (0-м по индексу) числом массива

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int n = 10;
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Random().nextInt(33) - 15;
            System.out.print(a[i] + "\t");
        }
        System.out.println();
        System.out.println("* * * Task 2.1 * * *");
        int min = a[1];
        for (int i = 1; i < a.length; i = i + 2) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("the smallest odd element of array = " + min);

        System.out.println("* * * Task 2.2 * * *");
// 2.2) Найти второй по максимальности элемент массива (т.е. из чисел 1 2 3 4 - 3 будет вторым по максимальности)
        int theMostGreater = Math.max(a[0], a[1]);
        int theSecondGreater = Math.min(a[0], a[1]);
        for (int i = 2; i < a.length; i++) {
            if (a[i] > theMostGreater) {
                theSecondGreater = theMostGreater;
                theMostGreater = a[i];
            } else if (a[i] > theSecondGreater && a[i] != theMostGreater) {
                theSecondGreater = a[i];
            }
        }
        System.out.println("the most greater = " + theMostGreater);
        System.out.println("the second greater = " + theSecondGreater);

        System.out.println("* * * Task 2.3 * * *");
// 2.3) Найти максимальный элемент массива и поменять его местами с 1-м (0-м по индексу) числом массива
        int maxI = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[maxI]) {
                maxI = i;
            }
        }
        int temp = a[0];
        a[0] = a[maxI];
        a[maxI] = temp;
        for (int j : a) {
            System.out.print(j + "\t");
        }
    }
}
