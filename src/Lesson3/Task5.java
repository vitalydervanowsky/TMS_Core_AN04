package Lesson3;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        // Дана квадртная матрица NxN
        int n = 5;
        int[][] a = new int[n][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = new Random().nextInt(10);
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        // 5.1) Найти максимум на главное диагонали
        System.out.println("  * * * Task 5.1 * * *");
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i][i];
        }
        System.out.println("sum = " + sum);

        // 5.2) Найти сумму элементов на побочной диагонали
        System.out.println("  * * * Task 5.2 * * *");
        sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i][a.length - i - 1];
        }
        System.out.println("sum = " + sum);

        // 5.3) Найти минимальное число из диагонали, стоящей над главной
        System.out.println("  * * * Task 5.3 * * *");
        int min = a[0][0];
        for (int i = 1; i < a.length; i++) {
            if (a[i][i] < min) {
                min = a[i][i];
            }
        }
        System.out.println("min = " + min);

        // 5.4) Транспонировать матрицу NxM
        System.out.println("  * * * Task 5.4 * * *");
        n = 3;
        int m = 4;
        a = new int[n][m];
        int[][] b = new int[m][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = new Random().nextInt(10);
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[j][i] = a[i][j];
            }
        }
        System.out.println("new array:");
        for (int[] ints : b) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }

        // 5.5) Перемножить две произвольные матрицы NxM и MxK (как перемножать матрицы можно погуглить)
        // пока нет времени
    }
}
