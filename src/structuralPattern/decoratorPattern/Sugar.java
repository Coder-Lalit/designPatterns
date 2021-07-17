package structuralPattern.decoratorPattern;

public class Sugar extends BeverageDecorator {
    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ " sugar added";
    }

    @Override
    public int getCost() {
        return super.getCost()+ 2;
    }
}
