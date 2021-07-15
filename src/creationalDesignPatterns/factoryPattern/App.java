package creationalDesignPatterns.factoryPattern;

public class App {
    public static void main(String[] args) {
        Driver driver = DriverFactory.getDriver(DriverType.FIREFOX);
        driver.open();
    }
}
