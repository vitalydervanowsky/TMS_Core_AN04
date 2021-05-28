package Lesson3;

// Дан произвольный массив чисел
// 1.1) Найти произведение элементов, кратных 3.
// 1.2) Найти среднее арифметическое элементов с нечетными номерами.
// 1.3) Найти средне арифметическое элементов массива, превосходящих некоторое число С.

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(10);
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        System.out.println("* * * Task 1.1 * * *");
        int result = 1;
        for (int j : array) {
            if (j % 3 == 0 && j != 0) {
                result *= j;
            }
        }
        System.out.println("result of multiplication = " + result);

        System.out.println("* * * Task 1.2 * * *");
        result = 0;
        int count = 0;
        for (int i = 1; i < array.length; i = i + 2) {
            result += array[i];
            count++;
        }
        System.out.println("sum = " + result + "\tquantity = " + count);
        double avg = (double) result / count;
        System.out.println("average off odd numbers = " + avg);

        System.out.println("* * * Task 1.3 * * *");
        int c = 5;
        result = 0;
        count = 0;
        for (int j : array) {
            if (j > c) {
                result += j;
                count++;
                System.out.println(j);
            }
        }
        avg = (double) result / count;
        System.out.println("average of numbers greater than " + c + " = " + avg);
    }
}
