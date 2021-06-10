package Lesson6.homeworkDragon;

public class Warrior {
    private final String name;
    private final Weapon weapon;

    public Warrior(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public void attack(Dragon dragon) {
        String currentWeapon = weapon.getName();
        String[] dragonMayBeKilledBy = dragon.getMayBeKilledBy();
        for (String s : dragonMayBeKilledBy) {
            if (currentWeapon.equals(s)) {
                dragon.setAlive(false);
                break;
            }
        }
        if (dragon.isAlive()) {
            System.out.println("Warrior was defeated by dragon, " +
                    "because dragon has resistance from " + currentWeapon);
        } else {
            System.out.println("Dragon is killed by warrior by " + currentWeapon);
        }
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
