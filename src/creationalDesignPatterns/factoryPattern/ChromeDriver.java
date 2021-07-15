package creationalDesignPatterns.factoryPattern;

public class ChromeDriver implements Driver{
    @Override
    public void open() {
        System.out.println("Opening with chrome driver");
    }
}
