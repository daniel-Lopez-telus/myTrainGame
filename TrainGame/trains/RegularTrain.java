package trains;

import engines.RegularEngine;

public class RegularTrain extends Train {

    public RegularTrain() {
        super();
        this.speed = 45;
        this.engine = new RegularEngine();
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
        System.out.println("Regular train is whistling...");
    }

    @Override
    public void turnOn() {
        System.out.println("Regular train is turning On...");
    }

    @Override
    public void turnOff() {
        System.out.println("Regular train is turning Off...");
    }

    @Override
    public String move() {
        return "Regular train is moving";
    }

    @Override
    public void stop() {
        System.out.println("Regular train is stopping...");
    }


    @Override
    public String toString() {
        return "Regular Train";
    }
}
