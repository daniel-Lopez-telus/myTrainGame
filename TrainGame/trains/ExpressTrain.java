package trains;

import engines.ElectricEngine;

public class ExpressTrain extends Train {

    public ExpressTrain() {
        super();
        this.speed = 90;
        this.engine = new ElectricEngine();
        turnOn();
    }

    public int getSpeed() {
        return this.speed;
    }

    @Override
    public String getEngine() {
        return this.engine.getDescription();
    }

    @Override
    public void whistle() {
        System.out.println("Express train is whistling...");
    }

    @Override
    public void turnOn() {
        System.out.println("Express train is turning On...");
    }

    @Override
    public void turnOff() {
        System.out.println("Express train is turning Off...");
    }

    @Override
    public String move() {
        return "Express train is moving ";
    }

    @Override
    public void stop() {
        System.out.println("Express train is stopping...");
    }

    @Override
    public String toString() {
        return "Express Train";
    }
}
