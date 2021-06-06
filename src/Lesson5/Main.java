package Lesson5;

public class Main {
    public static void main(String[] args) {
        Race orcs = new Race("Orc");
        Race elves = new Race("Elf");
        Race undeads = new Race("Undead");
        Race goblins = new Race("Goblin");
        Weapon ax = new Weapon("Ax");
        Weapon bow = new Weapon("Bow");
        Weapon skeleton = new Weapon("Skeleton");
        Warrior orc = new Orc("Alex", orcs, ax);
        Warrior elf = new Elf("Bob", elves, bow);
        Warrior undead = new Undead("Tom", undeads, skeleton);
        Warrior goblin = new Goblin("Chris", goblins, ax);

        orc.kill();
        elf.kill();
        undead.kill();
        goblin.kill();
    }
}
