package Lesson2;

// Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите 2 целых числа (день месяц): ");
        int day = sc.nextInt();
        int month = sc.nextInt();
        if (day > 0 && month > 0 && month < 13) {
            System.out.print("Знак зодиака для даты " + day + "." + month + " - ");
            if (month == 1 && day < 20) {
                System.out.println("река");
            } else if ((month == 2 && day < 21) || (month == 1 && day <= 31)) {
                System.out.println("клаксон");
            } else if ((month == 3 && day < 20) || (month == 2 && day <= 28)) {
                System.out.println("попугай");
            } else if ((month == 4 && day < 21) || (month == 3 && day <= 31)) {
                System.out.println("сухарь");
            } else if ((month == 5 && day < 20) || (month == 4 && day <= 30)) {
                System.out.println("зубр");
            } else if ((month == 6 && day < 21) || (month == 5 && day <= 31)) {
                System.out.println("щека");
            } else if ((month == 7 && day < 20) || (month == 6 && day <= 30)) {
                System.out.println("диктатор");
            } else if ((month == 8 && day < 21) || (month == 7 && day <= 31)) {
                System.out.println("чай");
            } else if ((month == 9 && day < 20) || (month == 8 && day <= 31)) {
                System.out.println("ключ");
            } else if ((month == 10 && day < 21) || (month == 9 && day <= 30)) {
                System.out.println("черпак");
            } else if ((month == 11 && day < 20) || (month == 10 && day <= 31)) {
                System.out.println("носорог");
            } else if ((month == 12 && day < 21) || (month == 11 && day <= 30)) {
                System.out.println("аквариум");
            } else if (month == 12 && day <= 31) {
                System.out.println("река");
            } else {
                System.out.println("Дата некорректна (не существует такого дня в месяце)");
            }
        } else {
            System.out.println("Дата некорректна (либо отрицательный день, либо такого месяца не существует)");
        }
        sc.close();
    }
}
