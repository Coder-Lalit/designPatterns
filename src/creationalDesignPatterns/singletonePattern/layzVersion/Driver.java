package creationalDesignPatterns.singletonePattern.layzVersion;

public class Driver {
    private static Driver driver;
    private Driver(){}

    public static Driver getDriver() {
        synchronized (Driver.class){
            if (driver == null)
                driver=new Driver();
            return driver;
        }
    }

    public void doSomething() {
        System.out.println("Do something..");
    }
}
