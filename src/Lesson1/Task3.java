package Lesson1;

// Даны 2 числа. Вывести большее из них.

public class Task3 {
    public static void main(String[] args) {
        System.out.println("* * * TASK 3 * * *");
        int a = 7;
        int b = -13;
        int max = (a + b + Math.abs(a - b)) / 2;
        System.out.println(max);

// > никто вас не похвалит за такое "изящное" решение, НО мы сейчас не учимся писать красивый код, мы разбираемся с базой языка
// это далеко не база языка, это математика. спасибо гуглу за решение.
    }
}
