package behavioralDesignPattern.commandPattern;

public class TurnOffLights implements Command{
    private Light light;

    public TurnOffLights(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.TurnOffLights();
    }
}
