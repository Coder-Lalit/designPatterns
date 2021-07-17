package structuralPattern.decoratorPattern;

public class Milk extends BeverageDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ " milk added";
    }

    @Override
    public int getCost() {
        return super.getCost()+ 5;
    }
}
