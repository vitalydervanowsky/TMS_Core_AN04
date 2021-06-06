package Lesson5;

public class Elf extends Warrior {
    public Elf(String name, Race race, Weapon weapon) {
        super(name, race, weapon);
    }

    public void takeWeapon(Weapon weapon) {
        System.out.println("Elf takes weapon " + weapon.getName());
    }

    public void sayHa() {
        System.out.println("Elf says: \"hallaha!\"");
    }

    public void attack() {
        System.out.println("Elf attacks");
    }

    public void celebrate() {
        System.out.println("Elf says: \"ullullullu\" (I win!)");
    }
}
