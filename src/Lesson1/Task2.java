package Lesson1;

// Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
// Определить существует ли такой треугольник. Дано: a, b, c – стороны предполагаемого треугольника.
// Требуется сравнить длину каждого отрезка-стороны с суммой двух других.
// Если хотя бы в одном случае отрезок окажется больше суммы двух других,
// то треугольника с такими сторонами не существует.

public class Task2 {
    public static void main(String[] args) {
        System.out.println("* * * TASK 2 * * *");
        int a = 7;
        int b = 13;
        int c = 11;
        boolean isTriangleExist = (a + b > c) && (a + c > b) && (b + c > a);
        System.out.println("is triangle exist with sides " + a + ", " + b + ", " + c + "? " + isTriangleExist);
    }
}
