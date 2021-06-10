package Lesson6.homeworkDragon;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Alex", new Weapon("bow"));
        warrior.attack(new Dragon(new Random().nextInt(3)));
    }
}
