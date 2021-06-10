package Lesson5;

public abstract class Warrior {
    private final String name;
    private final Race race;
    private final Weapon weapon;

    public Warrior(String name, Race race, Weapon weapon) {
        this.name = name;
        this.race = race;
        this.weapon = weapon;
    }

    public void kill() {
        System.out.println(name + " of race " + race.getName() + " is starting killing the enemy");
        takeWeapon(weapon);
        sayHa();
        attack();
        celebrate();
    }

    public abstract void takeWeapon(Weapon weapon);

    public abstract void sayHa();

    public abstract void attack();

    public abstract void celebrate();
}
