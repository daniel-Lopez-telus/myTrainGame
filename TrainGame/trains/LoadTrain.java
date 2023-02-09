package trains;

import engines.DieselEngine;

public class LoadTrain extends Train {

    public LoadTrain() {
        super();
        this.speed = 10;
        this.engine = new DieselEngine();
        turnOn();
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public String getEngine() {
        return this.engine.getDescription();
    }

    @Override
    public void whistle() {
        System.out.println("Load train is whistling...");
    }

    @Override
    public void turnOn() {
        System.out.println("Load train is turning On...");
    }

    @Override
    public void turnOff() {
        System.out.println("Load train is turning Off...");
    }

    @Override
    public String move() {
        return "Load train is moving";
    }

    @Override
    public void stop() {
        System.out.println("Load train is stopping...");
    }


    @Override
    public String toString() {
        return "Load Train";
    }
}
