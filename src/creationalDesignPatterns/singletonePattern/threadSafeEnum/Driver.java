package creationalDesignPatterns.singletonePattern.threadSafeEnum;

public enum Driver {
    DRIVER;
    public static void doSomething(){
        System.out.println("Do Something...");
    }
}
