package Lesson4;

public class Engine {
    private final String name;
    private final int volume;
    private boolean started = false;

    public Engine(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public void start(GasTank gasTank) {
        if (gasTank.getCurrent() > 0) {
            started = true;
            System.out.println("Engine " + name + " is starting");
        } else {
            System.out.println("Engine won't start, gas tank is empty");
        }
    }

    public void stop() {
        started = false;
        System.out.println("Engine is stopping");
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isStarted() {
        return started;
    }
}
