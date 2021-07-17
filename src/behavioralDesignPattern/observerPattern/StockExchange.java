package behavioralDesignPattern.observerPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StockExchange implements Subject{
    private float price;
    private Random random;
    List<Observer> observerList;

    @Override
    public void addObserver(Observer subject) {
        observerList.add(subject);
    }

    @Override
    public void removeObserver(Observer subject) {
        observerList.remove(subject);
    }

    @Override
    public void notifyObservers(float price) {
        observerList.forEach(o -> o.update(price) );
    }

    public StockExchange(float price) {
        this.price = price;
        random = new Random();
        observerList = new ArrayList<>();
    }

    public void start(){
        while(true){
            try{
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
            price= price + (2 *random.nextFloat()-1);
            notifyObservers(price);
            System.out.println(price);
        }
    }


}
