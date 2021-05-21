package Lesson1;

// В переменную записываем число. Надо вывести на экран сколько в этом числе цифр и положительное оно
// или отрицательное. Например, "это однозначное положительное число". Добавить решение для дробных чисел.

public class Task1 {
    public static void main(String[] args) {
        System.out.println("* * * TASK 1 * * *");
        int a = (int) (Math.random() * 50000 - 25000); // [-25000...25000]
        boolean isPositive = a >= 0;
        System.out.println(a + " is positive? " + isPositive);
        int length = Integer.toString(Math.abs(a)).length();
        System.out.println("length of " + a + " = " + length);

        double b = -1288.913;
        System.out.println(b);
        isPositive = b >= 0;
        System.out.println(b + " is positive? " + isPositive);
        String b1 = Double.toString(Math.abs(b));
        int pointPosition = b1.indexOf('.');
        String b2 = b1.substring(0, pointPosition);
        System.out.println("length of positive part of " + b + " = " + b2.length());
        b2 = b2 + b1.substring(pointPosition + 1);
        System.out.println("length of " + b + " = " + b2.length());
    }
}
