package creationalDesignPatterns.factoryPattern;

public class FirefoxDriver implements Driver{
    @Override
    public void open() {
        System.out.println("Opening with firefox driver");
    }
}
