package Lesson1;

// Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.

public class Task4 {
    public static void main(String[] args) {
        System.out.println("* * * TASK 4 * * *");
        int a = 7;
        int b = -13;
        int c = 11;
        int counter = (a / Math.abs(a) + b / Math.abs(b) + c / Math.abs(c) + 3) / 2;
        System.out.println("[" + a + ", " + b + ", " + c + "]");
        System.out.println("quantity of positive numbers = " + counter);
// решение этой задачи я нашел без гугла и раньше, чем решение 3й задачки. это называется "костыли"
// представьте себя на месте новичка, например, на месте детского стоматолога.
    }
}
