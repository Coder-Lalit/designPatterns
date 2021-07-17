package structuralPattern.decoratorPattern;

public class App {
    //Beverage , and Decorators are milk sugar
    public static void main(String[] args) {

        Beverage b = new Sugar(new Milk(new PlainBeverage()));
        System.out.println(b.getCost());
        System.out.println(b.getDescription());

    }
}
