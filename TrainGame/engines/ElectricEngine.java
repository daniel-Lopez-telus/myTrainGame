package engines;

public class ElectricEngine extends Engine{

    public ElectricEngine() {
        super();
        this.horsePower = 200;
        this.desc = "Electric engine with a horsePower of " + horsePower + " Hp";
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
