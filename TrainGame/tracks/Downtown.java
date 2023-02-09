package tracks;

public class Downtown extends Track{

    public Downtown() {
        super();
        this.radius = 8;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "downtown track";
    }

}
