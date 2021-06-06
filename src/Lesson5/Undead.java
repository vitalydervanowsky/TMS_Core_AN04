package Lesson5;

public class Undead extends Warrior {
    public Undead(String name, Race race, Weapon weapon) {
        super(name, race, weapon);
    }

    public void takeWeapon(Weapon weapon) {
        System.out.println("Undead takes " + weapon.getName());
    }

    public void sayHa() {
        System.out.println("Undead says: \"ghhghghghhghgh!\"");
    }

    public void attack() {
        System.out.println("Undead attacks");
    }

    public void celebrate() {
        System.out.println("Undead says: \"ghghhghhghgh\" (I win!)");
    }
}
