package behavioralDesignPattern.commandPattern;

public class TurnOnLights implements Command{

    private Light light;

    public TurnOnLights(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.TurnOnLights();
    }
}
