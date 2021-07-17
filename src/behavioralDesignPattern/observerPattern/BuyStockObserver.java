package behavioralDesignPattern.observerPattern;

public class BuyStockObserver implements Observer {
    @Override
    public void update(float price) {
        if(price<98)
        System.out.println("Buying the stock");
    }
}
