package tracks;

public class Forrest extends Track{

    public Forrest() {
        super();
        this.radius = 15;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "forrest track";
    }
}
