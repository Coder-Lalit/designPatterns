package creationalDesignPatterns.prototypePattern;

public class App {
    public static void main(String[] args) {
        Driver chrome = new Driver.Builder().setName("Chrome").setVersion(1).build();
        System.out.println(chrome.toString());
        System.out.println(chrome.cloneObject().toString());

    }
}
