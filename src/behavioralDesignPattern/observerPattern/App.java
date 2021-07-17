package behavioralDesignPattern.observerPattern;

public class App {
    public static void main(String[] args) {
        StockExchange stockExchange = new StockExchange(100);
        stockExchange.addObserver(new BuyStockObserver());
        stockExchange.addObserver(new SellStockObserver());
        stockExchange.start();
    }

}
