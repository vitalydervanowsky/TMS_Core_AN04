package Lesson4;

public class Car {
    private final Engine engine;
    private final GasTank gasTank;
    private String title;
    private int distance;
    private int year;

    public Car(Engine engine, GasTank gasTank) {
        this.engine = engine;
        this.gasTank = gasTank;
    }

    public void run() {
        engine.start(gasTank);
        if (engine.isStarted()) {
            System.out.println("Car is running");
            distance += 100;
            gasTank.setCurrent(gasTank.getCurrent() - 1);
        } else {
            System.out.println("Car is not running:");
            System.out.println(isEngineStarted());
        }

    }

    public GasTank getGasTank() {
        return gasTank;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getTitle() {
        return title;
    }

    public int getDistance() {
        return distance;
    }

    public int getYear() {
        return year;
    }

    public String isEngineStarted() {
        return engine.isStarted() ? "Engine is started" : "Engine is not started";
    }

    public void stop() {
        if (engine.isStarted()) {
            System.out.println("Car is stopping");
            engine.stop();
        } else {
            System.out.println("Couldn't stop stopped engine");
        }
    }

    public void tank(int gas) {
        System.out.println("Car is on gas station. Tanking of " + gas + " liters is starting");
        gasTank.tank(gas);
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
