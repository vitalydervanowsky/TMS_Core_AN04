package Lesson5;

public class Goblin extends Warrior {
    public Goblin(String name, Race race, Weapon weapon) {
        super(name, race, weapon);
    }

    public void takeWeapon(Weapon weapon) {
        System.out.println("Goblin takes weapon " + weapon.getName());
    }

    public void sayHa() {
        System.out.println("Goblin says: \"kurakatu!\"");
    }

    public void attack() {
        System.out.println("Goblin attacks");
    }

    public void celebrate() {
        System.out.println("Goblin says: \"qwickqwick\" (I win!)");
    }
}
