package creationalDesignPatterns.builderPattern;

public class App {
    public static void main(String[] args) {
        System.out.println(new Driver.Builder().setName("Chrome").setVersion(1).build().toString());
    }
}
