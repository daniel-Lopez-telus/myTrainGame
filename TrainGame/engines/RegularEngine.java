package engines;

public class RegularEngine extends Engine{

    public RegularEngine() {
        this.horsePower = 100;
        this.desc = "Regular engine with a horsePower of " + horsePower + " Hp";
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
