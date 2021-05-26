package Lesson2;

// 3.1) Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
// 3.2) Вычислить: 1+2+4+8+...+256
// 3.3) Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый день он увеличивал дневную норму на 10% нормы
// предыдущего дня. Какой суммарный путь пробежит спортсмен за 7 дней?

public class Task3 {
    public static void main(String[] args) {
        System.out.println("* * * Task 3.1 * * *");
        int sumOfOdd = 0;
        for (int i = 1; i <= 99; i = i + 2) {
            sumOfOdd += i;
        }
        System.out.println("сумма 1 + 3 + 5 +...+ 99 = " + sumOfOdd);

        System.out.println("* * * Task 3.2 * * *");
        int sumOfPowerOf2 = 0;
//        for (int i = 0; i <= 8; i++) {
//            sumOfPowerOf2 += Math.pow(2, i);
//        }
        int addition = 1;
        while (addition <= 256) {
            sumOfPowerOf2 += addition;
            addition *= 2;
        }
        System.out.println("сумма 1 + 2 + 4 +...+ 256 = " + sumOfPowerOf2);

        System.out.println("* * * Task 3.3 * * *");
        double dayDistanse = 10;
        double distanse = dayDistanse;
        double k = 1.1;
        for (int i = 2; i <= 7; i++) {
            dayDistanse *= k;
            distanse += dayDistanse;
        }
        System.out.println("За 7 дней спортсмен пробежит " + distanse + " км");
    }
}
