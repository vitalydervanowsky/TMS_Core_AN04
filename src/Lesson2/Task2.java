package Lesson2;

// Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите 2 целых числа (день месяц): ");
        int day = sc.nextInt();
        int month = sc.nextInt();
        if (day > 0 && day < 32 && month > 0 && month < 13) {
            System.out.print("Знак зодиака для даты " + day + "." + month + " - ");
            switch (month) {
                case 1: {
                    if (day < 20) {
                        System.out.println("река");
                    } else {
                        System.out.println("клаксон");
                    }
                    break;
                }
                case 2: {
                    if (day < 21) {
                        System.out.println("клаксон");
                    } else {
                        System.out.println("попугай");
                    }
                    break;
                }
                case 3: {
                    if (day < 29) {
                        System.out.println("попугай");
                    } else {
                        System.out.println("сухарь");
                    }
                    break;
                }
                case 4: {
                    if (day < 22) {
                        System.out.println("сухарь");
                    } else {
                        System.out.println("зубр");
                    }
                    break;
                }
                case 5: {
                    if (day < 21) {
                        System.out.println("зубр");
                    } else {
                        System.out.println("щека");
                    }
                    break;
                }
                case 6: {
                    if (day < 20) {
                        System.out.println("щека");
                    } else {
                        System.out.println("диктатор");
                    }
                    break;
                }
                case 7: {
                    if (day < 21) {
                        System.out.println("диктатор");
                    } else {
                        System.out.println("чай");
                    }
                    break;
                }
                case 8: {
                    if (day < 22) {
                        System.out.println("чай");
                    } else {
                        System.out.println("ключ");
                    }
                    break;
                }
                case 9: {
                    if (day < 20) {
                        System.out.println("ключ");
                    } else {
                        System.out.println("черпак");
                    }
                    break;
                }
                case 10: {
                    if (day < 21) {
                        System.out.println("черпак");
                    } else {
                        System.out.println("носорог");
                    }
                    break;
                }
                case 11: {
                    if (day < 22) {
                        System.out.println("носорог");
                    } else {
                        System.out.println("аквариум");
                    }
                    break;
                }
                case 12: {
                    if (day < 20) {
                        System.out.println("аквариум");
                    } else {
                        System.out.println("река");
                    }
                    break;
                }
            }
        } else {
            System.out.println("Дата некорректна");
        }
        sc.close();
    }
}
