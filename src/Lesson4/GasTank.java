package Lesson4;

public class GasTank {
    private int volume;
    private int current;

    public GasTank(int volume, int current) {
        if (volume >= current && current >= 0) {
            this.volume = volume;
            this.current = current;
        } else {
            System.out.println("Data is incorrect");
        }
    }

    public int getVolume() {
        return volume;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public void tank(int gas) {
        int newCurrent = current + gas;
        if (newCurrent <= volume) {
            current = newCurrent;
            System.out.println("Tanking is completed. There is " + current +
                    " liters in the gas tank");
        } else {
            current = volume;
            System.out.println("Gas tank is full, " + (newCurrent - current) +
                    " liters did not fit into the tank");
        }
    }
}
