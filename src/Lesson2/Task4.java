package Lesson2;

// Дано положительное число x (например 1098).
// Написать программу, которая печатает на консоль все цифры данного числа (используя цикл while)

public class Task4 {
    public static void main(String[] args) {
        int x = 1098;
        System.out.println(x);
        while (x > 0) {
            System.out.println(x % 10);
            x /= 10;
        }
    }
}
