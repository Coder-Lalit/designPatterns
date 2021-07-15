package creationalDesignPatterns.factoryPattern;

public class DriverFactory {

    public static Driver getDriver(DriverType type){
        switch (type){
            case CHROME:
                return new ChromeDriver();
            case FIREFOX:
                return new FirefoxDriver();
        }
        return null;
    }
}
