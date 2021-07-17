package behavioralDesignPattern.commandPattern;

public class DimLights implements Command{

    private Light light;

    public DimLights(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.dimLights();
    }
}
