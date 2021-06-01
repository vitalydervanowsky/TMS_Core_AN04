package Lesson3;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        // 3.1) В произвольно заполненном массиве проверить все ли числа разные
        System.out.println("  * * * Task 3.1 * * *");
        int n = new Random().nextInt(50);
        int[] a = new int[n];
        int bound = 5000;
        for (int i = 0; i < a.length; i++) {
            a[i] = new Random().nextInt(bound);
            System.out.print(a[i] + "  ");
        }
        boolean isUnique = true;
        for (int i = 0; i < a.length; i++) {
            if (!isUnique) {
                break;
            }
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    isUnique = false;
                    break;
                }
            }
        }
        System.out.println("\nisUnique = " + isUnique);

        // 3.2) Дан массив длины n=50, заполненный случайными числами из промежутка [a; b], a=0, b=100, b >= n всегда.
        // Проверить являютя ли все числа в массиве уникальными
        System.out.println("  * * * Task 3.2 * * *");
        n = 50;
        bound = 101;
        a = new int[n];
        int[] quantity = new int[bound];
        isUnique = true;
        for (int i = 0; i < a.length; i++) {
            a[i] = new Random().nextInt(bound);
            System.out.print(a[i] + "  ");
            quantity[a[i]]++;
            if (quantity[a[i]] > 1) {
                isUnique = false;
                break;
            }
        }
        System.out.println("\nisUnique = " + isUnique);

        // 3.3*) Оценить сложности алгоритмов для 3.1 и 3.2; 3.2 должен решаться за линейное время
        System.out.println("  * * * Task 3.3 * * *");
        System.out.println("В задании 3.1 сложность O(n^2)");
        System.out.println("В задании 3.2 сложность O(b) (в именах моих переменных - O(bound)");

        // 3.4*) Дан массив длины 20, заполненнйы случайнми числами из отрезка [0;5].
        // Для каждого числа из массива найти его кол-во. Решение за линейное время
        System.out.println("  * * * Task 3.4 * * *");
        n = 20;
        a = new int[n];
        bound = 6;
        for (int i = 0; i < a.length; i++) {
            a[i] = new Random().nextInt(bound);
            System.out.print(a[i] + "  ");
        }
        System.out.println();
        quantity = new int[bound];
        for (int j : a) {
            quantity[j]++;
        }
        for (int i = 0; i < quantity.length; i++) {
            System.out.println(i + " meets " + quantity[i] + " times");
        }
    }
}
