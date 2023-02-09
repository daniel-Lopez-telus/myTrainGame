package engines;

public class DieselEngine extends Engine{

    public DieselEngine() {
        super();
        this.horsePower = 140;
        this.desc = "Diesel engine with a horsePower of " + horsePower + " Hp";
    }

    @Override
    public String getDescription() {
        return this.desc;
    }

    @Override
    public int getHorsePower() {
        return this.horsePower;
    }
}
