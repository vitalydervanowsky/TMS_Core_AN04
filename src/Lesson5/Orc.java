package Lesson5;

public class Orc extends Warrior {
    public Orc(String name, Race race, Weapon weapon) {
        super(name, race, weapon);
    }

    public void takeWeapon(Weapon weapon) {
        System.out.println("Orc takes weapon " + weapon.getName());
    }

    public void sayHa() {
        System.out.println("Orc says: \"Rgtghr!\"");
    }

    public void attack() {
        System.out.println("Orc attacks");
    }

    public void celebrate() {
        System.out.println("Orc says: \"Rwgdtfr\" (I win!)");
    }
}
