package Lesson2;

// Написать программу, которая читает введеное с консоли число. Число должно быть от 1 до 12.
// Напечатать на консоль название месяца, которое соответствует введеному числу (например 1 - Январь)
// Если число неправильное (не от 1 до 12), напечатать на консоль сообщение, информирующее об ошибке
// (например "Неправильное число, должно быть от 1 до 12)

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое цисло от 1 до 12:");
        int x = sc.nextInt();
        switch (x) {
            case 1: {
                System.out.println("январь");
                break;
            }
            case 2: {
                System.out.println("февраль");
                break;
            }
            case 3: {
                System.out.println("март");
                break;
            }
            case 4: {
                System.out.println("апрель");
                break;
            }
            case 5: {
                System.out.println("май");
                break;
            }
            case 6: {
                System.out.println("июнь");
                break;
            }
            case 7: {
                System.out.println("июль");
                break;
            }
            case 8: {
                System.out.println("август");
                break;
            }
            case 9: {
                System.out.println("сентябрь");
                break;
            }
            case 10: {
                System.out.println("октябрь");
                break;
            }
            case 11: {
                System.out.println("ноябрь");
                break;
            }
            case 12: {
                System.out.println("декабрь");
                break;
            }
            default: {
                System.out.println("Неправильное число, должно быть от 1 до 12");
            }
        }

        sc.close();
    }
}
