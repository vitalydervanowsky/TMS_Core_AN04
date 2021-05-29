package Lesson3;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        // 4.1) Реализовать сортировку пузырьком, в которой мы выталкиваем сначала элемент слева-направо,
        // а затем на обратном пути справа-налево и т.д. (пример был на занятии)
        System.out.println("  * * * Task 4.1 * * *");
        int n = 20;
        int[] a = new int[n];
        int bound = 5000;
        for (int i = 0; i < a.length; i++) {
            a[i] = new Random().nextInt(bound);
            System.out.print(a[i] + "  ");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                int left = a[j];
                int right = a[j + 1];
                if (right < left) {
                    a[j] = right;
                    a[j + 1] = left;
                }
            }
        }
        for (int j : a) {
            System.out.print(j + "  ");
        }

        System.out.println();
        System.out.println("reverse version:");
        a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Random().nextInt(bound);
            System.out.print(a[i] + "  ");
        }
        System.out.println();
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = a.length - 1; j > 0; j--) {
                int left = a[j];
                int right = a[j - 1];
                if (right > left) {
                    a[j] = right;
                    a[j - 1] = left;
                }
            }
        }
        for (int j : a) {
            System.out.print(j + "  ");
        }
    }
}
