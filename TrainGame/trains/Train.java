package trains;

import engines.Engine;

public abstract class Train {

    protected int speed;
    protected Engine engine;

    public abstract int getSpeed();
    public abstract String getEngine();
    public abstract void whistle();
    public abstract void turnOn();
    public abstract void turnOff();
    public abstract String move();
    public abstract void stop();
    public abstract String toString();

}
