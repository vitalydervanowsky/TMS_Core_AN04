package Lesson2;

// 5.1) Написать программу, которая печатает на консоль прямоугольник из символа "@" длины NxM
// (задается вручную, т.е. int n = 10; int m = 5, например)
// @@@@@@@@@@
// @@@@@@@@@@
// @@@@@@@@@@
// @@@@@@@@@@
// @@@@@@@@@@
// 5.2) Дано число x, найти все простые числа от 1 до x (число считается простым, если делится только на себя и на 1)

public class Task5 {
    public static void main(String[] args) {
        System.out.println("* * * Task 5.1 * * *");
        int n = 30;
        int m = 3;
        char ch = '@';
        System.out.println("n = " + n + "\tm = " + m);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }

        System.out.println("* * * Task 5.2 * * *");
        int x = 99;
        for (int i = 2; i <= x; i++) {
            boolean isSimple = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isSimple = false;
                    break;
                }
            }
            if (isSimple) {
                System.out.print(i + "\t");
            }
        }
    }
}
