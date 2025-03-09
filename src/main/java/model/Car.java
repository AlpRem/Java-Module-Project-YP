package model;

public class Car {

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    private final String name;
    private final int speed;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }
}
