package behavioralDesignPattern.observerPattern;

public class SellStockObserver implements Observer {
    @Override
    public void update(float price) {
        if (price>103){
            System.out.println("Selling the stock");
        }
    }
}
