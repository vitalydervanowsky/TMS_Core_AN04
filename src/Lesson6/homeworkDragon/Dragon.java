package Lesson6.homeworkDragon;

public class Dragon {
    private boolean isAlive;
    private final String[] mayBeKilledBy = new String[2];

    public Dragon(int num) {
        isAlive = true;
        if (num == 0) {
            mayBeKilledBy[0] = "bow";
            mayBeKilledBy[1] = "water magic";
        } else if (num == 1) {
            mayBeKilledBy[0] = "sword";
            mayBeKilledBy[1] = "ax";
        } else if (num == 2) {
            mayBeKilledBy[0] = "sleep pills";
        }
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public String[] getMayBeKilledBy() {
        return mayBeKilledBy;
    }
}
