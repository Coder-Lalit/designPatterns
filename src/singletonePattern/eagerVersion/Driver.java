package singletonePattern.eagerVersion;

public class Driver {
    public static Driver INSTANCE = new Driver();
    private Driver(){}
    public static void doSomething(){
        System.out.println("Doing something...");
    }
}
