package singletonePattern.eagerVersion;

public class App {
    public static void main(String[] args) {
        Driver.INSTANCE.doSomething();
    }
}
